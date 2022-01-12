public java.lang.String doshowCheckValidateDetails() {
    groupAct = accountingviewBean.doGetGroupActivityByID(actId);
    java.lang.String state = groupAct.getActivity().getState();
    java.util.List<java.lang.String> inCheckStates = java.util.Arrays.asList("draft", "approved", "publish", "disapproved", "pending");
    if (inCheckStates.contains(state)) {
        return "ShowCheckDetails";
    }
    java.util.List<java.lang.String> inValidateStates = java.util.Arrays.asList("tobevalidate", "validate");
    if (inCheckStates.contains(inValidateStates)) {
        return "ShowValidateDetails";
    }
    return "Error";
}