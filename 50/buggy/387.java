@java.lang.Override
public void onClick(android.view.View v) {
    com.kcb.teacher.activity.test.EditTestActivity.sTest.addQuestion();
    showTestNameNum();
    switchNextButton();
    com.kcb.common.util.ToastUtil.toast(java.lang.String.format(getResources().getString(R.string.tch_question_added), questionNum));
}