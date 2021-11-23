@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (ir.rasen.charsoo.controller.helper.Params.ACTION_WORK_TIME)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        workTime = ir.rasen.charsoo.controller.helper.Globals.getInstance().getValue().workTime;
        buttonWorkTime.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.ic_check_green), null);
    }
}