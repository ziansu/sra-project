private void initPackageMappings(org.renjin.eval.Session session) {
    long emptyEnv = engine.rniSpecialObject(Rengine.SO_EmptyEnv);
    long hostEnv = engine.rniParentEnv(globalEnv);
    while (hostEnv != emptyEnv) {
        java.lang.String hostEnvName = getHostEnvironmentName(hostEnv);
        if ((hostEnvName != null) && (hostEnvName.startsWith("package:"))) {
            org.renjin.embed.Environment guestEnv = findGuestEnvironmentByName(session, hostEnvName);
            if (guestEnv != null) {
                globals.put(hostEnv, guestEnv);
            }
        }
        hostEnv = engine.rniParentEnv(hostEnv);
    } 
}