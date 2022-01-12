public void countStats() {
    for (models.Word word : _wordList) {
        if ((word.getStatus()) != (Status.Unseen)) {
            for (int i = 0; i < 3; i++) {
                _accuracyStats[i] += word.getStat(i);
            }
        }
    }
}