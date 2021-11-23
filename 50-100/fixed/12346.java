public static void setStatus(com.onaio.steps.model.Household household, com.onaio.steps.model.Member member, java.util.ArrayList<java.lang.String> row) {
    if ((((household.getSelectedMemberId()) == null) || (household.getSelectedMemberId().equals(""))) || (household.getSelectedMemberId().equals(java.lang.String.valueOf(member.getId()))))
        row.add(household.getStatus().toString());
    else {
        row.add(com.onaio.steps.helper.Constants.SURVEY_NOT_SELECTED);
    }
}