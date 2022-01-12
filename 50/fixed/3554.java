public java.lang.String getNextTestCase() {
    if ((i) < (testcases.size())) {
        return testcases.get(((i)++));
    }else {
        return null;
    }
}