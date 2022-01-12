public void playerPassword(org.bukkit.entity.Player p, java.lang.String password) {
    if (((password.length()) < 5) || ((password.length()) > 50)) {
        p.sendMessage("Your password must be between 5 and 50 characters in length.");
        return ;
    }
    config("playerpasswords").set(p.getName(), password);
    if (saveConfig("playerpasswords"))
        p.sendMessage("Your password has been set.");
    else
        p.sendMessage("An error occurred while trying to save your password. Please try again later.");
    
}