public void flushAllFrames() {
    for (int i = 0; i < (frametab.length); ++i) {
        if ((frametab[i].pageno) != null) {
            if ((frametab[i].valid) && (frametab[i].dirty)) {
                flushPage(frametab[i].pageno);
            }
        }
    }
}