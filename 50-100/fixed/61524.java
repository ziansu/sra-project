@java.lang.Override
public void onClick(android.view.View v) {
    mCancelButtonClicked = false;
    if (v == (mCancel)) {
        mCancelButtonClicked = true;
        onBackPressed();
    }else
        if (v == (mNext)) {
            android.content.Intent intent = new android.content.Intent(v.getContext(), com.lanesgroup.jobviewer.fragment.QuestionsActivity.class);
            intent.putExtra(Utils.UPDATE_RISK_ASSESSMENT_ACTIVITY, selectedScreenId);
            startActivity(intent);
        }
    
}