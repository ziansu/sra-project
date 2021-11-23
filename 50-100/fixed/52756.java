public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String parentKey = ((java.lang.String) (parent.getTag(R.id.key)));
    if (position >= 0) {
        java.lang.String value = ((java.lang.String) (parent.getItemAtPosition(position)));
        getView().writeValue(mStepName, parentKey, value);
    }
}