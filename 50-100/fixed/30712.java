public static void loadSettings() {
    net.net63.codearcade.LSD.utils.Settings.loadDefaults();
    for (java.lang.String name : net.net63.codearcade.LSD.utils.Settings.preferences.get().keySet()) {
        if (name.equals("currentLevel"))
            net.net63.codearcade.LSD.utils.Settings.setCurrentLevel(net.net63.codearcade.LSD.utils.Settings.preferences.getInteger(name));
        
        if (name.equals("musicVolume"))
            net.net63.codearcade.LSD.utils.Settings.setMusicVolume(net.net63.codearcade.LSD.utils.Settings.preferences.getFloat(name));
        
        if (name.equals("soundVolume"))
            net.net63.codearcade.LSD.utils.Settings.setSoundVolume(net.net63.codearcade.LSD.utils.Settings.preferences.getFloat(name));
        
    }
}