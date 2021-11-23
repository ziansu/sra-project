private void createActions() {
    java.util.List<logist.topology.Topology.City> neighbourCities = currentCity.neighbors();
    if (!(hasAvailableTask)) {
        for (logist.topology.Topology.City neighbourCity : neighbourCities) {
            actions.add(new template.Action(false, currentCity, neighbourCity));
        }
    }else {
        actions.add(new template.Action(true, currentCity, destinationCity));
        for (logist.topology.Topology.City neighbourCity : neighbourCities) {
            actions.add(new template.Action(false, currentCity, neighbourCity));
        }
    }
}