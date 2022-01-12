@java.lang.Override
public void onSpinnerItemSelected(android.widget.Spinner spinner, int position) {
    if ((spinner.getId()) == (org.droidplanner.android.R.id.cameraFileSpinner)) {
        com.o3dr.services.android.lib.drone.mission.item.complex.CameraDetail cameraInfo = cameraAdapter.getItem(position);
        for (T survey : getMissionItems()) {
            survey.getSurveyDetail().setCameraDetail(cameraInfo);
        }
        onScrollingEnded(mAnglePicker, 0, 0);
    }
}