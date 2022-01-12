public void won(int result) {
    for (int i = 0; i < (experience.size()); i++) {
        java.lang.String key = experience.get(i);
        if (brain.containsKey(key)) {
            brain.put(key, ((brain.get(key)) + result));
        }else {
            brain.put(key, result);
        }
    }
    writeBrain(((name) + "Brain.txt"));
}