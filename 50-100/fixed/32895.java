public static void commandSave(java.lang.String[] args, java.lang.Boolean silent) {
    try {
        file.saveAll();
        global.trigger = file.loadTriggers("./mods/ChatTriggers/triggers.txt", false);
        global.USR_string = file.loadStrings("./mods/ChatTriggers/strings.txt");
        global.settings = file.loadSettings("./mods/ChatTriggers/settings.txt");
        chat.warn(chat.color(global.settings.get(0), "Organized and saved files"));
    } catch (java.io.IOException e) {
        chat.warn(chat.color("red", "Error saving triggers!"));
    }
}