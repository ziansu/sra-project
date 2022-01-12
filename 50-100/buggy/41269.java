private void toggleSemester() {
    mStartSemester.setVisibility(View.GONE);
    mEndSemester.setVisibility(View.GONE);
    if ((mSemesters) == null)
        return ;
    
    if ((mSemesters.size()) == 0) {
        mStartSemester.setVisibility(View.VISIBLE);
    }else
        if ((mSemesters.size()) == 1) {
            mStartSemester.setVisibility(View.VISIBLE);
        }
    
}