private java.util.List<com.zingkg.arkhamhorrorassistant.xml.CultEncounter> parseCultEncounterResource(int resource) {
    java.io.Reader reader = readResource(resource);
    java.util.List<com.zingkg.arkhamhorrorassistant.xml.CultEncounter> cards = com.zingkg.arkhamhorrorassistant.xml.CultEncounter.parseReader(reader);
    try {
        reader.close();
    } catch (java.io.IOException e) {
        android.util.Log.w(com.zingkg.arkhamhorrorassistant.app.MainActivity.TAG, ("Error closing cult encounter reader " + e));
    }
    return cards;
}