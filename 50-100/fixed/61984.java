@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof org.odk.collect.android.logic.DatePickerDetails)) {
        return false;
    }
    org.odk.collect.android.logic.DatePickerDetails datePickerDetails = ((org.odk.collect.android.logic.DatePickerDetails) (obj));
    return (this.datePickerType.equals(datePickerDetails.datePickerType)) && (this.datePickerMode.equals(datePickerDetails.datePickerMode));
}