public void createList(java.lang.StringBuffer result) {
    android.content.Intent intent = new android.content.Intent(getActivity(), nagaiko.track_alcohol.ListActivity.class);
    intent.putExtra("result", ((java.io.Serializable) (result)));
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(intent);
    getActivity().finish();
}