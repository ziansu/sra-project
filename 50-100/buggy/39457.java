public void toMessage(java.lang.StringBuilder sb) {
    sb.append("INIT");
    sb.append("\n");
    sb.append(player.team);
    sb.append("\n");
    appendMap(sb);
    sb.append("TINI");
    sb.append("\n");
    sb.setLength(((sb.length()) - 1));
}