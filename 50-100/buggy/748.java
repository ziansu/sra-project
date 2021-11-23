@java.lang.Override
public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if ((user != null) && (e == null)) {
        android.util.Log.i("LogInSuccess", "LogInSuccess");
        showCustomProgress(false);
        android.content.Intent dashboard = new android.content.Intent(getActivity(), com.example.abhishek.sharerides.activities.DashboardActivity.class);
        startActivity(dashboard);
        getActivity().finish();
    }else {
        showCustomProgress(false);
        android.widget.Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
    }
}