@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == 1314) && (resultCode == 1)) {
        java.lang.String cityName = data.getStringExtra("cityName");
        if (cityName.contains("市")) {
            leftBtn.setText(cityName);
        }else {
            leftBtn.setText((cityName + "市"));
        }
        setSelectPos(1);
    }
}