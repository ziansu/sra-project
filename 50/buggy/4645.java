void test1(@org.checkerframework.checker.index.qual.IndexFor(value = "(this).array")
int i) {
    int x = this.array[i];
}