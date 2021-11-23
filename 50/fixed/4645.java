void test1(@org.checkerframework.checker.index.qual.IndexFor(value = "array")
int i) {
    int x = array[i];
}