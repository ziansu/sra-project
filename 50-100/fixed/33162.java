private static void checkObject(int objectType, int operation, java.lang.Object uiObject) {
    if (uiObject == null) {
        junit.framework.Assert.assertTrue(((("Not find the object with object type: " + objectType) + ", opration type: ") + operation), false);
    }else
        if (framework.excute.Excute.isNeedCheckObject(objectType, operation)) {
            junit.framework.Assert.assertTrue(((("Not find the object with object type: " + objectType) + ", opration type: ") + operation), ((com.android.uiautomator.core.UiObject) (uiObject)).exists());
        }
    
}