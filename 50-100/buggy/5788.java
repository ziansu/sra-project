private static void commandLoad() {
    com.kerbybit.chattriggers.globalvars.global.canSave = true;
    try {
        com.kerbybit.chattriggers.globalvars.global.trigger = com.kerbybit.chattriggers.file.FileHandler.loadTriggers("./mods/ChatTriggers/triggers.txt", false, null);
        com.kerbybit.chattriggers.globalvars.global.USR_string = com.kerbybit.chattriggers.file.FileHandler.loadStrings("./mods/ChatTriggers/strings.txt");
        com.kerbybit.chattriggers.globalvars.global.settings = com.kerbybit.chattriggers.file.FileHandler.loadSettings("./mods/ChatTriggers/settings.txt");
        com.kerbybit.chattriggers.file.FileHandler.loadImports("./mods/ChatTriggers/Imports/");
        com.kerbybit.chattriggers.commands.CommandReference.silentResetAll();
        com.kerbybit.chattriggers.chat.ChatHandler.warn(((global.settings.get(0)) + "Files loaded"));
    } catch (java.io.IOException e) {
        com.kerbybit.chattriggers.chat.ChatHandler.warn(com.kerbybit.chattriggers.chat.ChatHandler.color("red", "Error loading triggers!"));
    }
}