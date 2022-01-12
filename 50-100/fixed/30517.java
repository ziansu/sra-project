public void onClick(android.content.DialogInterface dialog, int id) {
    view.findViewById(R.id.datePicker_datePicker);
    if ((resultDate.getTimeInMillis()) != (initialDate.getTimeInMillis())) {
        resultDateTime = resultDate.getTime();
        getCallBack().deliverDatePickerResult(resultDateTime);
    }
    this.dismiss();
}