public void createList(java.lang.StringBuffer result) {
    android.content.Intent intent = new android.content.Intent(getActivity(), nagaiko.track_alcohol.ListActivity.class);
    intent.putExtra("result", ((java.io.Serializable) (result)));
    startActivity(intent);
    getActivity().finish();
}