public static java.lang.String setDescription(java.lang.String roomName, java.lang.String desc) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(com.twippy587.ChatRooms.manager.MessageManager.pluginPrefix);
    sb.append(" ");
    sb.append(ChatColor.GREEN);
    sb.append("Set ");
    sb.append(ChatColor.DARK_PURPLE);
    sb.append(roomName);
    sb.append("'s description to: ");
    sb.append(ChatColor.WHITE);
    sb.append(desc);
    return sb.toString();
}