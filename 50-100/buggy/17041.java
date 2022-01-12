private void createActions() {
    java.util.List<logist.topology.Topology.City> neighbourCities = currentCity.neighbors();
    if (!(hasAvailableTask)) {
        boolean isPickUpTask = false;
        for (logist.topology.Topology.City neighbourCity : neighbourCities) {
            actions.add(new template.Action(isPickUpTask, currentCity, neighbourCity));
        }
    }else {
        actions.add(new template.Action(hasAvailableTask, currentCity, destinationCity));
    }
}