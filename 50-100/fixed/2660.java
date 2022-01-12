public void countStats() {
    _accuracyStats = new int[3];
    for (models.Word word : _wordList) {
        if ((word.getStatus()) != (Status.Unseen)) {
            for (int i = 0; i < 3; i++) {
                _accuracyStats[i] += word.getStat(i);
            }
        }
    }
}