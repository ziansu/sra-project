public java.lang.String getConditionsAsString() {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (pt.uc.dei.nobugssnackbar.model.mission.Condition c : conditions) {
        result.append(c.getConditionString());
        result.append(" ");
    }
    if ((result.length()) > 0)
        conditionsAsString = result.toString().trim();
    
    return conditionsAsString;
}