public static void commandLoad(java.lang.String[] args, java.lang.Boolean silent) {
    try {
        global.trigger = file.loadTriggers("./mods/ChatTriggers/triggers.txt");
        global.USR_string = file.loadStrings("./mods/ChatTriggers/strings.txt");
        global.settings = file.loadSettings("./mods/ChatTriggers/settings.txt");
        file.loadImports("./mods/ChatTriggers/Imports/");
        chat.warn(((global.settings.get(0)) + "Files loaded"));
    } catch (java.io.IOException e) {
        chat.warn(chat.color("red", "Error loading triggers!"));
    }
}