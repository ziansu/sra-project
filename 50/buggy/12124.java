@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    java.lang.Runtime.getRuntime().runFinalization();
    java.lang.Runtime.getRuntime().gc();
}