@java.lang.SuppressWarnings(value = "SpellCheckingInspection")
@java.lang.Override
protected void doUpdate() {
    switch (getVersion()) {
        case 1 :
            lang.set("Language.Ingame.Cooldown", "Please wait till you reopen your backpack.");
        case 2 :
            lang.set("Language.Ingame.InvalidBackpack", lang.getString("Language.Ingame.IvalidBackpack", "Invalid backpack."));
        case 3 :
        case 4 :
            lang.set("Language.Ingame.WrongGameMode", "You are not allowed to open your backpack in your current game-mode.");
            break;
    }
}