@java.lang.Override
public java.util.List<java.lang.String> getFullyQualifiedClassNameList() throws java.io.IOException {
    java.util.List<java.lang.String> result = null;
    if (scanFuture.isDone()) {
        try {
            result = scanFuture.get();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            throw new java.io.IOException("扫描组件期间发生错误");
        } catch (java.util.concurrent.ExecutionException e) {
            e.printStackTrace();
            throw new java.io.IOException("扫描组件期间发生错误");
        }
    }
    return result;
}