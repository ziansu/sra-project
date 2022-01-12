@java.lang.Override
public void onSuccess(int statusCode, java.lang.String response) {
    if (!(response.isEmpty())) {
        android.widget.TextView user_name = ((android.widget.TextView) (findViewById(R.id.user_name)));
        user_name.setText(response);
        user_name.setLayoutParams(new android.widget.LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }
    selectSection(com.bukhmastov.cdoitmo.MainActivity.selectedSection);
}