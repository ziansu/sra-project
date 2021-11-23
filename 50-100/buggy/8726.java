public void generate(int before, int after) {
    if ((this.statement1) == (Statement.NULL)) {
        statement2.generate(before, after);
    }else
        if ((statement2) == (Statement.NULL)) {
            statement1.generate(before, after);
        }else {
            int label = newLabel();
            statement1.generate(before, label);
            emitLabel(label);
            statement2.generate(label, after);
        }
    
}