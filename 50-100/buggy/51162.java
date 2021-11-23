private static java.lang.String[] listExistingProfiles() {
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    int count = 0;
    for (int i = 0; i < (dk.bjop.wirecuddler.config.CuddleProfile.allowedProfileFilenames.length); i++) {
        java.io.File f = new java.io.File(dk.bjop.wirecuddler.config.CuddleProfile.allowedProfileFilenames[i]);
        if (f.exists()) {
            names.add(dk.bjop.wirecuddler.config.CuddleProfile.allowedProfileFilenames[i]);
            count++;
        }
    }
    return names.toArray(new java.lang.String[count]);
}