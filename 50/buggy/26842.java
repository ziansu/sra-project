@android.annotation.SuppressLint(value = "InlinedApi")
@java.lang.Override
public void run() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        enterImmersiveMode();
    }else {
        enterImmersiveModeBelowKitKat();
    }
}