public static com.sb.elsinore.inputs.PhSensor findPhSensor(java.lang.String string) {
    string = string.replace(" ", "_");
    java.util.Iterator<com.sb.elsinore.inputs.PhSensor> iterator = com.sb.elsinore.LaunchControl.phSensorList.iterator();
    com.sb.elsinore.inputs.PhSensor tPh;
    while (iterator.hasNext()) {
        tPh = iterator.next();
        if (tPh.getName().equalsIgnoreCase(string)) {
            return tPh;
        }
    } 
    return null;
}