public long editVocab(com.bathem.vocabpower.Entity.Vocab vocab) {
    long result;
    int id = vocab.getWord().getId();
    result = editWordbyId(vocab.getWord().getWord(), vocab.getWord().getId());
    if (result != (com.bathem.vocabpower.Helper.DataBaseHelper.ERROR_IN_QUERY)) {
        editMeaning(vocab.getMeaning(), id);
        editExample(vocab.getExample(), id);
    }
    return id;
}