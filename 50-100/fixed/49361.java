public static boolean isContolInput(java.lang.String input) {
    if ((((input.equals(org.arriva.movesample.core.FieldControlInputs.UP.toString())) || (input.equals(org.arriva.movesample.core.FieldControlInputs.DOWN.toString()))) || (input.equals(org.arriva.movesample.core.FieldControlInputs.RIGHT.toString()))) || (input.equals(org.arriva.movesample.core.FieldControlInputs.LEFT.toString()))) {
        return true;
    }
    return false;
}