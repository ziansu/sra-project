public void setLine(int line, java.lang.String text) {
    if ((text == null) || (text.isEmpty())) {
        removeLine(line);
        return ;
    }
    text = org.bukkit.ChatColor.translateAlternateColorCodes('&', text);
    if (line >= (armorStands.size())) {
        addLine(line, text);
        return ;
    }
    armorStands.get(line).setCustomName(text);
}