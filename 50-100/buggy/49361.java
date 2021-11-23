public static boolean isContolInput(java.lang.String input) {
    if ((((input.equals(org.arriva.movesample.core.FieldControlInputs.UP)) || (input.equals(org.arriva.movesample.core.FieldControlInputs.DOWN))) || (input.equals(org.arriva.movesample.core.FieldControlInputs.RIGHT))) || (input.equals(org.arriva.movesample.core.FieldControlInputs.LEFT))) {
        return true;
    }
    return false;
}