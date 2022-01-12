protected void execute() {
    time = timeSinceInitialized();
    java.lang.System.out.println(time);
    if ((time) <= 3) {
        lights.setBaseColor(SubsystemIndex.ALL);
        lights.setBaseColor(SubsystemIndex.BACKBUMPER);
    }else
        if ((time) <= 6) {
            lights.sendMessage(SubsystemIndex.BALLTRACK, "countdown");
        }else
            if ((time) <= 9) {
                lights.sendMessage(SubsystemIndex.BACKBUMPER, "Enforcers");
            }
        
    
    java.lang.System.out.println("Execute");
}