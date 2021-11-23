private boolean processNames(java.lang.String names) {
    java.io.DataOutputStream stream = GetOutputStream();
    if (null == stream) {
        WooMinecraft.log.severe("Cannot open Data output stream!");
    }
    try {
        stream.writeBytes(("names=" + names));
        stream.flush();
        stream.close();
    } catch (java.io.IOException e) {
        WooMinecraft.log.severe(e.getMessage());
        return false;
    }
    return true;
}