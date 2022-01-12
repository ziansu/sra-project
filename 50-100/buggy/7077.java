public long getConsecutiveGuesses() {
    if (misses.isEmpty()) {
        return hits.size();
    }
    java.util.Collections.sort(hits);
    java.util.Collections.sort(misses);
    java.util.Date lastMiss = hits.get(((hits.size()) - 1));
    long hitsCount = 0;
    for (java.util.Date date : hits) {
        if (date.after(lastMiss)) {
            hitsCount++;
        }
    }
    return hitsCount;
}