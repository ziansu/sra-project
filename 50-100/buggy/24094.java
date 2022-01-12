private void loadSets(java.io.File octgnDir) {
    java.util.List<uk.co.haradan.octgnimageloader.Set> sets = loader.loadSets(log, octgnDir);
    synchronized(this) {
        loadedSets = sets;
        int numSets = sets.size();
        setsSelected = new boolean[numSets];
        for (int i = 0; i < numSets; i++)
            setsSelected[i] = true;
        
        dirTxt.setText(octgnDir.getAbsolutePath());
    }
}