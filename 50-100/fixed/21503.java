@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == 1) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            if (data != null) {
                java.lang.String passwordFieldString = data.getExtras().getString("some_key");
                passwordEditText.setText(passwordFieldString);
                getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
        }
    }
}