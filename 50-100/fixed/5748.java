private hudson.util.FormValidation validate(java.lang.String value) {
    try {
        int val = java.lang.Integer.parseInt(value);
        if (val < 0) {
            return hudson.util.FormValidation.error("Value should be greater than 0");
        }
        if (val > 100) {
            return hudson.util.FormValidation.ok(("NOTE: value greater than 100 only make sense when Threshold Mode " + "is set to 'Number of Tests'"));
        }
        return hudson.util.FormValidation.ok();
    } catch (java.lang.NumberFormatException ex) {
        return hudson.util.FormValidation.error("value should be an integer");
    }
}