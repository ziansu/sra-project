private void revealNeighbors(Field field) {
    java.util.List<Field> fields = getAllNeighbors(field);
    for (Field neighborField : fields) {
        if (neighborField == null) {
            continue;
        }
        if ((neighborField.getStatus()) == (Field.Status.OPENED)) {
            continue;
        }
        calculateNumber(neighborField);
        if ((neighborField.getNumber()) == 0) {
            neighborField.setStatus(Field.Status.OPENED);
            windowController.updateField(neighborField);
            revealNeighbors(neighborField);
        }
    }
}