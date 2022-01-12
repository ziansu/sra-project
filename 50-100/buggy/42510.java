private void toggleGodMode(org.bukkit.entity.Player targetPlayer) {
    modYMLManager.toggleVariable(targetPlayer.getName(), YMLVariable.GOD_MODE);
    if (modYMLManager.isVariableActive(targetPlayer.getName(), YMLVariable.GOD_MODE)) {
        de.wonderworld.plugins.selfmadeEssentials.commands.LocaleHandler.sendLocalizedMessage(targetPlayer, "GODMODE_IS_NOW_ON");
    }else {
        localizedMessenger.sendLocalizedMessage(targetPlayer, "GODMODE_IS_NOW_OFF");
    }
}