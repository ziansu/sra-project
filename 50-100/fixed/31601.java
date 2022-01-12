public Word getNext() {
    float rand = ((float) (java.lang.Math.random()));
    float counter = 0;
    for (java.util.Map.Entry<Word, java.lang.Integer> entry : map.entrySet()) {
        int value = entry.getValue();
        float percent = value / (total);
        if ((percent + counter) >= rand) {
            return entry.getKey();
        }else {
            counter += percent;
        }
    }
    return null;
}