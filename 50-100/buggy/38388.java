public void clear() {
    this.field = new de.hs_bochum.ss.model.FieldValue[9][9];
    for (int j = 0; j < (field.length); j++) {
        for (int i = 0; i < (field[j].length); i++) {
            field[j][i] = new de.hs_bochum.ss.model.FieldValue();
        }
    }
}