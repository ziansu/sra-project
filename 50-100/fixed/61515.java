@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == 1) && (resultCode == (example.com.sdi_mrdd.activities.WellDashBoardFragment.RESULT_OK))) {
        curvesToAdd = data.getStringArrayListExtra("curveList");
        if ((curvesToAdd) != null) {
        }
    }
}