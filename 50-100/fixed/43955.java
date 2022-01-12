public void setOnlineOnly(java.lang.String taxName, java.lang.Boolean online, java.lang.Double interval) {
    conf.save();
    conf.setProperty((("taxes." + taxName) + ".onlineOnly.isEnabled"), online);
    conf.setProperty((("taxes." + taxName) + ".onlineOnly.interval"), interval);
    conf.save();
    return ;
}