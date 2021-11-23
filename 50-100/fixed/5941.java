public void exit(int line) {
    if (line >= 0) {
        int currentCount = --(counts[line]);
        if (currentCount == 0) {
            times[line] += (java.lang.System.nanoTime()) - (start[line]);
            start[line] = 0L;
        }
        if (line > (max)) {
            max = line;
        }
    }
}