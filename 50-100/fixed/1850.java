private static void scheduleSave() {
    if (!(com.asml.innovationteam.rover.RoverProperties.saveScheduled)) {
        java.util.Timer tmr = new java.util.Timer();
        tmr.schedule(new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                com.asml.innovationteam.rover.RoverProperties.save();
                com.asml.innovationteam.rover.RoverProperties.saveScheduled = false;
            }
        }, 5000);
        com.asml.innovationteam.rover.RoverProperties.saveScheduled = true;
    }
}