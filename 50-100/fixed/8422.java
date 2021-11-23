public static boolean deletePhSensor(final java.lang.String name) {
    java.lang.String realName = name.replace(" ", "_");
    java.util.Iterator<com.sb.elsinore.inputs.PhSensor> iterator = com.sb.elsinore.LaunchControl.phSensorList.iterator();
    com.sb.elsinore.inputs.PhSensor tSensor;
    while (iterator.hasNext()) {
        tSensor = iterator.next();
        if (tSensor.getName().equalsIgnoreCase(realName)) {
            iterator.remove();
            return true;
        }
    } 
    return false;
}