public void onClick(android.content.DialogInterface dialog, int id) {
    view.findViewById(R.id.datePicker_datePicker);
    resultDateTime = ((resultDate.getTimeInMillis()) == (initialDate.getTimeInMillis())) ? null : resultDate.getTime();
    getCallBack().deliverDatePickerResult(resultDateTime);
    this.dismiss();
}