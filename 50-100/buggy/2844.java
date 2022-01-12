public static org.arriva.movesample.core.FieldControlInputs convertStringToControlInput(java.lang.String input) {
    if (!(org.arriva.movesample.core.FieldControlInputs.isContolInput(input))) {
        return org.arriva.movesample.core.FieldControlInputs.UNDEFINED;
    }
    if (input.equals(org.arriva.movesample.core.FieldControlInputs.UP)) {
        return org.arriva.movesample.core.FieldControlInputs.UP;
    }
    if (input.equals(org.arriva.movesample.core.FieldControlInputs.DOWN)) {
        return org.arriva.movesample.core.FieldControlInputs.DOWN;
    }
    if (input.equals(org.arriva.movesample.core.FieldControlInputs.RIGHT)) {
        return org.arriva.movesample.core.FieldControlInputs.RIGHT;
    }
    return org.arriva.movesample.core.FieldControlInputs.LEFT;
}