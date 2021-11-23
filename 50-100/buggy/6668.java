private void revertInformationOfRequest(final com.dmm.leavemanagementsystem.models.LeaveRequest request, final int position) {
    setupTextViewStatus(request);
    setupLinearLayoutApproveOrUnapprove(request, position);
    setupSpinnerSubject(request, position);
    setupTextViewPhone(request);
    setupEditTextMessage(request);
    setupTextViewFromDate(request);
    setupTextViewFromHour(((request.getSt_approve()) == 0));
    setupSpinnerDuration(request.getDuration());
    setupTextViewUnitDuration();
    setupLinearLayoutDeleteAndRevert(request, position);
}