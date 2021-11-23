@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus == true) {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }else {
        if (com.example.llh_pc.it_support.activities.frmDangKy.Ifullname.getText().toString().equals("")) {
            errorname.setVisibility(View.VISIBLE);
        }else {
            errorname.setVisibility(View.GONE);
            com.example.llh_pc.it_support.activities.frmDangKy.Ifullname.setText(result);
        }
    }
}