@java.lang.Override
public void onCompletion(com.app.sircle.WebService.PostResponse postResponse, com.app.sircle.Utility.AppError error) {
    ringProgressDialog.dismiss();
    if (postResponse != null) {
        android.widget.Toast.makeText(getActivity(), postResponse.getMessage(), Toast.LENGTH_SHORT).show();
        if ((postResponse.getStatus()) == 200) {
            android.content.Intent homeIntent = new android.content.Intent(getActivity(), com.app.sircle.UI.Activity.BaseActivity.class);
            startActivity(homeIntent);
        }
    }else {
        android.widget.Toast.makeText(getActivity(), "some error occurred", Toast.LENGTH_SHORT).show();
    }
}