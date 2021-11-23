@java.lang.Override
public int compare(selenium.IInvokedMethod o1, selenium.IInvokedMethod o2) {
    int r = o1.getTestMethod().getTestClass().getName().compareTo(o2.getTestMethod().getTestClass().getName());
    if (r == 0) {
    }
    return r;
}