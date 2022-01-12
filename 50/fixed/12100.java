protected <T> T runBlockingOnImeThread(java.util.concurrent.Callable<T> c) throws java.lang.Exception {
    return org.chromium.content.browser.input.ImeTestUtils.runBlockingOnHandler(mConnectionFactory.getHandler(), c);
}