public static com.bathem.vocabpower.Entity.Vocab getRandomVocab(android.content.Context context) {
    if (((com.bathem.vocabpower.Model.DataModel.sWords) == null) && ((com.bathem.vocabpower.Model.DataModel.sWords.size()) < 0)) {
        android.util.Log.d("debug", "No word list available for random words prepartion.");
        return null;
    }
    int id = com.bathem.vocabpower.Helper.Utils.getRandomNumber(1, com.bathem.vocabpower.Model.DataModel.sWords.size());
    com.bathem.vocabpower.Helper.DataBaseHelper db = new com.bathem.vocabpower.Helper.DataBaseHelper(context);
    com.bathem.vocabpower.Model.DataModel.sCurrentRandomVocab = db.getVocabByID(id);
    return com.bathem.vocabpower.Model.DataModel.sCurrentRandomVocab;
}