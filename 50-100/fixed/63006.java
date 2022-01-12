public void loadProfiles() {
    data.Profile toAdd;
    java.io.File savedFolder = new java.io.File("resources/saved");
    java.io.File[] profileList = savedFolder.listFiles();
    for (java.io.File prof : profileList) {
        if (prof.isFile()) {
            try {
                toAdd = gameDataFile.loadData(prof.toPath());
                profiles.add(toAdd);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}