public static void main(java.lang.String[] args) throws java.io.IOException {
    for (int i = 0; i < (TestController.files.length); i++) {
        TestController.tests(10, "g", ((TestController.root) + (TestController.files[i])), i, TestController.maxValues[i]);
        TestController.tests(10, "p", ((TestController.root) + (TestController.files[i])), i, TestController.maxValues[i]);
    }
}