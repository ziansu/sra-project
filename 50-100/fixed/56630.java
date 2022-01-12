@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.Class<?> activity = getCreateNewActivityClass();
    if (activity != null) {
        android.support.v7.widget.SearchView searchView = ((android.support.v7.widget.SearchView) (this.findViewById(R.id.search)));
        searchView.setIconified(true);
        startActivityForResult(new android.content.Intent(v.getContext(), activity), Constant.NEW_ENTITY_CODE);
    }else {
        cz.brno.holan.jiri.hunggarkuenfinancials.Log.warning(getBaseContext(), new java.security.InvalidParameterException(getString(R.string.activity_error)));
    }
}