public Word getNext() {
    int rand = WordMap.getIntBetween(0, 100);
    int counter = 0;
    for (java.util.Map.Entry<Word, java.lang.Integer> entry : map.entrySet()) {
        int value = entry.getValue();
        float percent = (value / (total)) * 100;
        if ((percent + counter) >= rand) {
            return entry.getKey();
        }else {
            counter += percent;
        }
    }
    return null;
}