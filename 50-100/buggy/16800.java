public static void deleteSwitch(final java.lang.String name) {
    synchronized(com.sb.elsinore.LaunchControl.switchList) {
        java.util.Iterator<com.sb.elsinore.Switch> iterator = com.sb.elsinore.LaunchControl.switchList.iterator();
        com.sb.elsinore.Switch tSwitch;
        while (iterator.hasNext()) {
            tSwitch = iterator.next();
            if ((tSwitch.getName().equalsIgnoreCase(name)) || (tSwitch.getNodeName().equalsIgnoreCase(name))) {
                iterator.remove();
                return ;
            }
        } 
    }
}