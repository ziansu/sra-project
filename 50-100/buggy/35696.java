@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonMeasurePrevious :
            this.onClickButtonPrevious();
            break;
        case R.id.buttonMeasureNext :
            this.onClickButtonNext();
            break;
        case R.id.buttonMeasureValidate :
            this.onClickButtonValidateMeasure();
            break;
        case R.id.buttonMeasureTerminate :
            this.onClickButtonTerminate();
            break;
        default :
            android.util.Log.e(fr.visian.azuretelemetry.controllers.activities.MeasureActivity.TAG, getString(R.string.log_err_unknown_button));
            break;
    }
}