public synchronized void addWordAfter(hrcek.core.Word word, int index) {
    if (wordsAfter.get(index).containsKey(word)) {
        wordsAfter.get(index).put(word.getName(), ((wordsAfter.get(index).get(word)) + 1));
    }else {
        wordsAfter.get(index).put(word.getName(), 1);
    }
}