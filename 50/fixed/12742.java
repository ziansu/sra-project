public void addJsonData(java.util.Collection<models.Etikett> uploadData) {
    play.Logger.debug((("Insert " + (uploadData.size())) + " new labels."));
    for (models.Etikett e : uploadData) {
        addJsonData(e);
    }
}