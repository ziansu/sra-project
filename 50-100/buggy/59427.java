public final java.lang.String getCommandID() {
    final java.lang.String[] sections = getCommandName().split("(?=[A-Z][a-z])");
    final java.lang.StringBuilder buf = new java.lang.StringBuilder();
    final int N = sections.length;
    for (int i = 1; i < (N - 1); ++i) {
        if (i > 1)
            buf.append("_");
        
        buf.append(sections[i].toLowerCase());
    }
    return buf.toString();
}