@java.lang.Override
public void onMessage(java.lang.Object msg) {
    java.lang.String jsonString;
    switch (wso2Count.incrementAndGet()) {
        case 1 :
            jsonString = "{\"event\":{\"symbol\":\"WSO2\",\"price\":55.6,\"volume\":100}}";
            org.junit.Assert.assertEquals(jsonString, msg);
            break;
        case 2 :
            jsonString = "{\"event\":{\"symbol\":\"WSO2\",\"price\":56.6,\"volume\":101}}";
            org.junit.Assert.assertEquals(jsonString, msg);
            break;
        default :
            org.junit.Assert.fail();
    }
}