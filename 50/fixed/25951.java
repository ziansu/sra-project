public static com.github.sdmcraft.meetme.Context getInstance(java.lang.String asteriskIp, java.lang.String asteriskAdmin, java.lang.String asteriskPassword, java.lang.String extensionUrl) throws java.lang.Exception {
    com.github.sdmcraft.meetme.Context context = new com.github.sdmcraft.meetme.Context(asteriskIp, asteriskAdmin, asteriskPassword, extensionUrl);
    return context;
}