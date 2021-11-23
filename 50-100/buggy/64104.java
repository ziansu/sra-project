@java.lang.Override
public void onNext(com.ckt.ckttodo.database.Result value) {
    switch (value.getResultcode()) {
        case com.ckt.ckttodo.network.BeanConstant.SUCCESS_RESULT_CODE :
            android.widget.Toast.makeText(this, getString(R.string.new_task_successful), Toast.LENGTH_SHORT).show();
            setResult(com.ckt.ckttodo.ui.NewProjectActivity.NEW_PROJECT_SUCCESS_RESULT_CODE);
            finish();
            break;
        case com.ckt.ckttodo.network.BeanConstant.USER_STATUS_INVALID_ERRO_RESULT_CODE :
            android.widget.Toast.makeText(this, getString(R.string.login_status_timeout), Toast.LENGTH_SHORT).show();
            break;
        case com.ckt.ckttodo.network.BeanConstant.PASS_DATA_INVALID_RESULT_CODE :
            android.widget.Toast.makeText(this, getString(R.string.invalid_parameters), Toast.LENGTH_SHORT).show();
            break;
    }
}