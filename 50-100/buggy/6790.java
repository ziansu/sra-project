public static com.sb.elsinore.Temp findTemp(final java.lang.String name) {
    synchronized(com.sb.elsinore.LaunchControl.tempList) {
        java.util.Iterator<com.sb.elsinore.Temp> iterator = com.sb.elsinore.LaunchControl.tempList.iterator();
        com.sb.elsinore.Temp tTemp;
        while (iterator.hasNext()) {
            tTemp = iterator.next();
            if ((tTemp.getName().equalsIgnoreCase(name)) || (tTemp.getProbe().equalsIgnoreCase(name))) {
                return tTemp;
            }
        } 
    }
    return null;
}