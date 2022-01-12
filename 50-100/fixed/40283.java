@org.junit.Test
public void testDummy() {
    long currentThreadId = java.lang.Thread.currentThread().getId();
    long mainThreadId = android.os.Looper.getMainLooper().getThread().getId();
    java.lang.System.out.println(((("mainThreadId=" + mainThreadId) + ", currentThreadId=") + currentThreadId));
    com.avos.avoscloud.im.v2.AVIMMessageStorage storage = com.avos.avoscloud.im.v2.AVIMMessageStorage.getInstance(defaultClient);
    org.junit.Assert.assertNotNull(storage);
}