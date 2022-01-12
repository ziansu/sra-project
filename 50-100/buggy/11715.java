static boolean isAxiom(Expression d) {
    for (int i = 0; i < (LogicHW1.axioms.size()); i++) {
        if (LogicHW1.axioms.get(i).equalStruct(d, new java.util.HashMap<>(), true)) {
            LogicHW1.out.println((("Сх. акс. " + i) + 1));
            return true;
        }
    }
    return false;
}