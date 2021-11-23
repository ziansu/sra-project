@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if ((mActivity.getSteps()[position]) == null) {
        mCursor.moveToPosition(position);
        mActivity.getSteps()[position] = com.amagh.bakemate.models.Step.createStepFromCursor(mCursor);
        mActivity.getSteps()[position].setStepId(position);
        prepareMediaSources(position);
    }
    return com.amagh.bakemate.ui.StepDetailsFragment.newInstance(mActivity.getSteps()[position]);
}