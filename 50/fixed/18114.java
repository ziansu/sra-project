private void initializeCitiesSpinner() {
    if ((mCity) == null)
        return ;
    
    mCity.setAdapter(new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, mCityList));
    mCity.setSelection(0);
}