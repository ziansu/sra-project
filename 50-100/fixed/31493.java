public java.lang.String getCommandLine() {
    final java.lang.StringBuffer buf = new java.lang.StringBuffer();
    buf.append(typeStr);
    if ((args.size()) > 0) {
        for (final java.lang.String arg : args) {
            buf.append(" ");
            buf.append(arg);
        }
    }
    buf.append("\n");
    return buf.toString();
}