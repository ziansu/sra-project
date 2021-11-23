@java.lang.Override
public void input(java.lang.String text) {
    if ((wrapee) instanceof io.appium.java_client.MobileElement) {
        ((io.appium.java_client.MobileElement) (wrapee)).setValue(text);
    }else {
        super.input(text);
    }
}