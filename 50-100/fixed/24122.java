@java.lang.Override
public void close() {
    int n = (pages.size()) - 1;
    if (n > (-1)) {
        for (int i = 0; i < n; i++) {
            release(pages.getQuick(i));
        }
        releaseLast(pages.getQuick(n));
    }
    pages.clear();
    appendPointer = -1;
    pageHi = -1;
    baseOffset = 1;
    clearHotPage();
}