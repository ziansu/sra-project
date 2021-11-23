@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String value = org.hisp.dhis.android.sdk.ui.adapters.rows.dataentry.QuestionCoordinatesRow.getLatitudeFromValue(mBaseValue);
    if ((s.length()) > 1) {
        if (s.toString().equals(org.hisp.dhis.android.sdk.ui.adapters.rows.dataentry.QuestionCoordinatesRow.getLongitudeFromValue(mBaseValue))) {
            return ;
        }
        java.lang.String newValue = s.toString();
        org.hisp.dhis.android.sdk.ui.adapters.rows.dataentry.QuestionCoordinatesRow.saveCoordinates(mEditTextLatitude, mEditTextLongitude, mBaseValue);
        if (org.hisp.dhis.android.sdk.ui.adapters.rows.dataentry.QuestionCoordinatesRow.isInvalidLongitude(newValue)) {
            mEditTextLongitude.setError(mLongitudeMessage);
        }
        setValidationError(newValue);
    }
}