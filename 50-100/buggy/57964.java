@java.lang.Override
public void run() {
    java.lang.Class clazz;
    if (spajam2016.haggy.carrybagbag.util.MyPrefs.isFnishedHelloActivity(this)) {
        if (spajam2016.haggy.carrybagbag.util.MyPrefs.existTargetCarry(this)) {
            clazz = spajam2016.haggy.carrybagbag.CarryActivity.class;
        }else {
            clazz = spajam2016.haggy.carrybagbag.SearchActivity.class;
        }
    }else {
        clazz = spajam2016.haggy.carrybagbag.HelloActivity.class;
    }
    spajam2016.haggy.carrybagbag.util.MyPrefs.setTargetCarry(this, null);
    clazz = spajam2016.haggy.carrybagbag.SearchActivity.class;
    final android.content.Intent intent = new android.content.Intent(this, clazz);
    startActivity(intent);
    finish();
}