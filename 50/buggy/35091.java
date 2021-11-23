@org.junit.Test(expected = java.lang.NullPointerException.class)
public void toAll_withNullRadio() {
    string.enableBlinkEffect(((short) (1000)), new com.valkryst.VRadio.Radio());
}