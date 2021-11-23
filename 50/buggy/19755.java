public void addMedicine() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(Constants.IS_INIT, isInit);
    startActivity(intent.setClass(this, com.umb.cs682.projectlupus.activities.medicineAlert.AddMedicine.class));
}