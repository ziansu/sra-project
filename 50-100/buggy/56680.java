public void displaySensors() {
    java.lang.Integer i = 1;
    synchronized(com.sb.elsinore.LaunchControl.tempList) {
        for (com.sb.elsinore.Temp tTemp : com.sb.elsinore.LaunchControl.tempList) {
            java.math.BigDecimal currentTemp = tTemp.updateTemp();
            java.lang.System.out.print((((i.toString()) + ") ") + (tTemp.getName())));
            if (currentTemp.equals(Temp.ERROR_TEMP)) {
                BrewServer.LOG.warning(" doesn't have a valid temperature");
            }else {
                BrewServer.LOG.info((" " + currentTemp));
            }
            i++;
        }
    }
}