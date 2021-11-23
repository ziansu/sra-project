@java.lang.Override
public void onStart() {
    super.onStart();
    java.lang.System.out.println("inside onstart()");
    getSyncService().addListener(dataListener);
}