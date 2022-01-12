private boolean generateCodeThatReplacesAssignmentToSpecialField(@mockit.internal.expectations.transformation.NotNull
java.lang.String fieldName) {
    if ("result".equals(fieldName)) {
        generateCallToActiveInvocationsMethod("addResult", "(Ljava/lang/Object;)V");
        return true;
    }
    if ((("times".equals(fieldName)) || ("minTimes".equals(fieldName))) || ("maxTimes".equals(fieldName))) {
        generateCallToActiveInvocationsMethod(fieldName, "(I)V");
        return true;
    }
    if ("$".equals(fieldName)) {
        generateCallToActiveInvocationsMethod("setErrorMessage", "(Ljava/lang/CharSequence;)V");
        return true;
    }
    return false;
}