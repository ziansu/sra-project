@java.lang.Override
public void onResume() {
    edu.berkeley.cs.amplab.carat.android.CaratApplication.setActionList(this);
    refresh();
    super.onResume();
}