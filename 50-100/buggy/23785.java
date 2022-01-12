public void setResidence(final java.lang.String code) {
    final int pos = ((com.wealdtech.android.CountryAdapter) (residence.getAdapter())).positionForCode(code);
    if (pos == (-1)) {
        android.util.Log.w("paymanual", ("Attempt to set unknown country of residence " + code));
    }else {
        nationality.setSelection(pos);
    }
}