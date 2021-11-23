public void ban(java.lang.String reason) {
    android.content.SharedPreferences sharedPreferences = getActivity().getSharedPreferences("squirrel", Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putBoolean("isBanned", true);
    editor.putBoolean("isMember", false);
    editor.putString("reason", reason);
    editor.commit();
    android.content.Intent intent = new android.content.Intent(getActivity(), info.philboyd.secretsquirrelsociety.activities.MainActivity.class);
    getActivity().startActivity(intent);
    getActivity().finish();
}