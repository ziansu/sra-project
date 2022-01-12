public void addChamp(java.lang.String champion, boolean inRuntime) {
    if (((champions.size()) == 0) | (!(champions.contains(champion)))) {
        champions.add(champion);
    }
    if (inRuntime) {
        int t = lib.size();
        t--;
        if (!(lib.get(t).champions.contains(champion))) {
            lib.get(t).addChamp(champion, false);
        }
    }
}