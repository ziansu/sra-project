@java.lang.Override
public void failed(java.lang.Throwable e, org.junit.runner.Description description) {
    org.maxwu.jrefresh.ColorPrint.println_blue((("Case " + (description.getMethodName())) + " fails."));
}