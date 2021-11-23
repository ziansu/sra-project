private android.widget.SpinnerAdapter getSpinnerAdapter(java.util.List<com.chatapp.service.models.response.ParamModel> params) {
    android.widget.ArrayAdapter<com.chatapp.service.models.response.ParamModel> dataAdapter = new android.widget.ArrayAdapter(this, R.layout.spinner_item);
    com.chatapp.service.models.response.ParamModel noneParam = new com.chatapp.service.models.response.ParamModel(0, "Not set");
    dataAdapter.add(noneParam);
    dataAdapter.addAll(params);
    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    return dataAdapter;
}