public void displayMedicineDetails() {
    this.runOnUiThread(new java.lang.Runnable() {
        public void run() {
            txtMedicineName.setText(medicineName);
            txtTotalNumberOfPills.setText(java.lang.Integer.toString(totalNumberOfPills));
            txtCurrentNumberOfPills.setText(java.lang.Integer.toString(currentNumberOfPills));
            txtTimesADay.setText(java.lang.Integer.toString(timesADay));
            txtPillPerIntake.setText(java.lang.Integer.toString(pillPerIntake));
            txtPrescription.setText(prescription);
            txtMedicineStatus.setText(medicineStatus);
            com.example.team11.MedDetailsActivity.getMedicineProgressDialog.dismiss();
        }
    });
}