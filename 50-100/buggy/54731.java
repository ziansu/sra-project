@java.lang.SuppressWarnings(value = "SpellCheckingInspection")
@java.lang.Override
protected void doUpdate() {
    switch (getVersion()) {
        case 1 :
            lang.set("Language.Ingame.Cooldown", "Please wait till you reopen your backpack.");
        case 2 :
            lang.set("Language.Ingame.InvalidBackpack", lang.getString("Language.Ingame.IvalidBackpack", "Invalid backpack."));
        case 3 :
            lang.set("Language.Console.MinecraftVersionNotCompatible", "Your minecraft version (MC %1$s) is currently not compatible with this plugins version (%2$s). Please check for updates!");
        case 4 :
            lang.set("Language.Ingame.WrongGameMode", "You are not allowed to open your backpack in your current game-mode.");
            break;
    }
}