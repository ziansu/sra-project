@java.lang.Override
public java.lang.String getNiceName() {
    java.lang.String name = "sign (";
    if (((actionData.lines) != null) && ((actionData.lines.length) > 0)) {
        name += com.helion3.prism.libs.elixr.TypeUtils.join(actionData.lines, (((org.bukkit.ChatColor.DARK_AQUA) + ", ") + (org.bukkit.ChatColor.RESET)));
    }else {
        name += "no text";
    }
    name += (org.bukkit.ChatColor.DARK_AQUA) + ")";
    return name;
}