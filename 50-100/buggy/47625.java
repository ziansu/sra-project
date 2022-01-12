private void showDatePicker2() {
    if ((datePickView2) == null) {
        datePickView2 = new com.paulz.carinsurance.ui.DateAfterPickView(this);
        datePickView2.setDatePickListener(new com.paulz.carinsurance.ui.DateAfterPickView.DatePickListener() {
            @java.lang.Override
            public void onSelected(java.lang.String date) {
                if (com.paulz.carinsurance.utils.DateUtil.afterToday(date, false)) {
                    data.businessinsdate = date;
                    btnEffectiveDate2.setText(date);
                }else {
                    com.paulz.carinsurance.utils.AppUtil.showToast(getApplication(), "生效日期必须从明天起");
                }
            }
        });
    }
    datePickView2.show();
}