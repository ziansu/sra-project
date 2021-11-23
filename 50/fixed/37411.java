@java.lang.Override
public void onInputDialogOKClick(java.lang.String editTextValue, lu.mike.uni.velohproject.DialogManager.InputRequest inputRequest) {
    if ((!(editTextValue.isEmpty())) && (inputRequest.equals(inputRequest.REQUEST_INPUT_FOR_STATIONS_IN_RANGE))) {
        doRequestStationsInRange(java.lang.Double.valueOf(editTextValue), mLastLocation);
    }
}