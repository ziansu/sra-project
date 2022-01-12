@java.lang.Override
public void onSpinnerItemSelected(android.widget.Spinner spinner, int position) {
    if ((spinner.getId()) == (org.droidplanner.android.R.id.cameraFileSpinner)) {
        com.o3dr.services.android.lib.drone.mission.item.complex.CameraDetail cameraInfo = cameraAdapter.getItem(position);
        for (com.o3dr.services.android.lib.drone.mission.item.complex.StructureScanner scan : getMissionItems()) {
            com.o3dr.services.android.lib.drone.mission.item.complex.SurveyDetail surveyDetail = scan.getSurveyDetail();
            surveyDetail.setCameraDetail(cameraInfo);
        }
        submitForBuilding();
    }
}