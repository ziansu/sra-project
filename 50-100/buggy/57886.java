public static java.lang.String getMessage(java.lang.String s) {
    if (com.nielsha.plugins.mysqlregister.managers.MessageManager.c.contains(s))
        return org.bukkit.ChatColor.translateAlternateColorCodes('&', com.nielsha.plugins.mysqlregister.managers.MessageManager.c.getString(s));
    else {
        com.nielsha.plugins.mysqlregister.Core.console((("Can't find message '" + s) + "'"));
        return "NULL";
    }
}