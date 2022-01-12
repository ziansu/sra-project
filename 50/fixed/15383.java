@java.lang.Override
public void onSuccess() {
    mainActivity.getActivityHelper().closeLoadingBar();
    android.util.Log.d(Constants.TAG, "New Order successfully created on the server.");
    mainActivity.replaceFragment(R.id.fragment_verifying_order_textview1, null);
}