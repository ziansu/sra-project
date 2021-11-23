private static java.lang.String getContainerData() {
    java.lang.String data = "";
    for (org.farmingtonrobotics.scouting.matchscouting2015.Container c : org.farmingtonrobotics.scouting.matchscouting2015.ObjStor.arrayContainers) {
        data.concat(("," + (c.toString())));
    }
    return data;
}