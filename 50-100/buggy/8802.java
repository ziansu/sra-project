@java.lang.Override
public void onFragmentInteraction(int requestCode, int resultCode, java.lang.Object... objects) {
    switch (requestCode) {
        case com.joss.jrow.TrainingEnvironment.TrainingActivity.SAVE_REQUEST_CODE :
            if (resultCode == (RESULT_OK)) {
                com.joss.jrow.Models.Training.getTraining().save(((java.lang.String) (objects[0])));
            }
            break;
        case com.joss.jrow.TrainingEnvironment.TrainingActivity.CALIBRATION_REQUEST_CODE :
            if (resultCode == (RESULT_OK)) {
                com.joss.jrow.Models.Measures.getMeasures().setDefaultCalibration();
                startTraining();
            }
    }
}