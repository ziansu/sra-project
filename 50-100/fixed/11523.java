@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.kame.tafhd.MainActivity.TEST_MSG :
            new com.kame.tafhd.Publisher().publish(((java.lang.String) (msg.obj)));
            break;
        case com.kame.tafhd.MainActivity.UNRELEVANT_MSG :
            new com.kame.tafhd.Publisher().publish("I am in the unrelevent parts.");
            break;
        case com.kame.tafhd.MainActivity.ANOTHER :
            new com.kame.tafhd.Publisher().publish(((java.lang.String) (msg.obj)));
            break;
        default :
            break;
    }
}