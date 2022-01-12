public void makeCall(android.view.View view) {
    java.lang.String callNum = mCallNumET.getText().toString();
    android.util.Log.wtf(TAG, ("makeCall: " + callNum));
    if ((callNum.isEmpty()) || (callNum.equals(this.username))) {
        showToast("Enter a valid user ID to call.");
        return ;
    }
    dispatchCall(callNum);
}