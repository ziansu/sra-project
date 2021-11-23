private static void loadConfiguration() {
    io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.usernames = io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.configuration.getStringList("Usernames", Configuration.CATEGORY_GENERAL, new java.lang.String[]{ "Enter" , " Usernames" }, "Enter the username you want to change");
    io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.nicknames = io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.configuration.getStringList("Nicknames", Configuration.CATEGORY_GENERAL, new java.lang.String[]{ "Enter the nickname" , " In the same position as the above username" }, "Enter the nickname");
    if (io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.configuration.hasChanged()) {
        io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.configuration.save();
    }
}