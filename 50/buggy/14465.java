@butterknife.OnClick(value = R.id.btn_finish_test)
public void finishTestOnClick() {
    ((com.blackteam.testbox.ui.TestQuestionActivity) (getActivity())).finishTest();
}