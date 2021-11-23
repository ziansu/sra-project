private boolean validateTimeRequirement() {
    util.Util.clearError(lblTimeRequirementError);
    if (txtTimeRequirement.isMessageDefault()) {
        return true;
    }
    try {
        int timeRequirement = java.lang.Integer.parseInt(txtTimeRequirement.getText());
        if (timeRequirement < 0) {
            util.Util.setError(lblTimeRequirementError, "Invalid value, must be positive whole numbers only");
            return false;
        }
    } catch (java.lang.NumberFormatException e) {
        util.Util.setError(lblTimeRequirementError, "Invalid value, whole numbers only");
        return false;
    }
    return true;
}