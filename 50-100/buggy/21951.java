public long editVocab(com.bathem.vocabpower.Entity.Vocab vocab) {
    long id;
    id = editWordbyId(vocab.getWord().getWord(), vocab.getWord().getId());
    if (id != (com.bathem.vocabpower.Helper.DataBaseHelper.ERROR_IN_QUERY)) {
        editMeaning(vocab.getMeaning(), id);
        editExample(vocab.getExample(), id);
    }
    return id;
}