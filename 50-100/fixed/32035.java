public static boolean getBoolean(com.bladecoder.ink.runtime.Story story, java.lang.String varName) {
    java.lang.Integer boolVal = ((java.lang.Integer) (story.getVariablesState().get(varName)));
    if (boolVal == null) {
        return false;
    }
    try {
        if (boolVal.equals(1)) {
            return true;
        }
        return false;
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
}