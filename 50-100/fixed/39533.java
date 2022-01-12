@org.junit.Test
public void initTests() {
    org.matrix.androidsdk.util.MXOsHandler.mPostListener = new org.matrix.androidsdk.util.MXOsHandler.IPostListener() {
        @java.lang.Override
        public void onPost(android.os.Looper looper) {
            org.robolectric.shadows.ShadowLooper shadowLooper = ((org.robolectric.shadows.ShadowLooper) (org.robolectric.internal.ShadowExtractor.extract(looper)));
            if (null != shadowLooper) {
                shadowLooper.idle();
            }
        }
    };
}