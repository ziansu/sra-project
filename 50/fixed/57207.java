public void GoToSessionTwo(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, jp.ac.tsukuba.cs.iplab.www.barotouchexperimentalapplications.SessionTwoActivity.class);
    intent.putExtra("Calibration", calibration);
    startActivity(intent);
}