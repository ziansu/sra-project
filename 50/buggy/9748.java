void addIndexOrLow(@org.checkerframework.checker.index.qual.IndexOrLow(value = "arr")
int v) {
    @org.checkerframework.checker.index.qual.IndexOrHigh(value = "arr")
    int result = 1 + v;
    IndexFor("arr");
    int indexFor = 1 + v;
}