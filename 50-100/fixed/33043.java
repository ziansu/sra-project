public void deletePlant(int plantIndex) {
    synchronized(this.mPlants) {
        java.util.ArrayList<java.lang.String> imagePaths = mPlants.get(plantIndex).getImages();
        for (java.lang.String filePath : imagePaths) {
            new java.io.File(filePath).delete();
        }
        mPlants.remove(plantIndex);
        android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().remove(java.lang.String.valueOf(plantIndex)).apply();
    }
}