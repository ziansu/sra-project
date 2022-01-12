@org.junit.Test
public void startActivityWithDefaultIntentAndDefaultCategoryWithOptionalArgs() {
    io.appium.java_client.android.IntentTest.driver.startActivity("com.prgguru.android", ".GreetingActivity", null, null, "android.intent.action.MAIN", "android.intent.category.DEFAULT", "0x4000000", "--es \"USERNAME\" \"AppiumIntentTest\" -t \"text/plain\"");
    org.junit.Assert.assertEquals(io.appium.java_client.android.IntentTest.driver.findElementById("com.prgguru.android:id/textView1").getText(), "Welcome AppiumIntentTest");
}