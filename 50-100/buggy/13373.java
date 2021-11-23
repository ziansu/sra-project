@java.lang.Override
public void onClick(android.view.View v) {
    try {
        java.lang.String User = sharedPreference.getUser(v.getContext());
        sharedPreference.removeUser(v.getContext());
        android.content.Intent i = new android.content.Intent(getActivity(), com.mattricks.deliverit.LoginActivity.class);
        startActivity(i);
        getActivity().finish();
    } catch (java.lang.NullPointerException e) {
        android.util.Log.e("TagFragmentProfile", e.toString());
    }
}