public void populateSpinner(org.hisp.dhis2.android.sdk.utils.ui.views.CardSpinner spinner, java.util.List<java.lang.String> list) {
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(getActivity(), R.layout.spinner_item, list);
    spinner.setAdapter(adapter);
}