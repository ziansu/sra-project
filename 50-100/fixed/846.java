public void run() {
    while (true) {
        try {
            java.util.List<com.dawai.Dawai> dawaiList = com.dawai.DawaiServer.fNurse.getDawaiToTake(com.dawai.DawaiServer.fCalendar);
            for (com.dawai.Dawai d : dawaiList) {
                com.dawai.DawaiServer.sendMessage(java.lang.String.format("Remember to take dawai - %s", d.getfDawaiName()));
                java.lang.Thread.sleep(1000);
            }
        } catch (java.lang.Exception e) {
        }
    } 
}