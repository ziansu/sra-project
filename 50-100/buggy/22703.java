@java.lang.Override
public boolean equals(java.lang.Object n) {
    boolean result = false;
    if (n instanceof structure.Conc) {
        structure.Conc test = ((structure.Conc) (n));
        if (getDroit().equals(test.getDroit())) {
            if (getGauche().equals(test.getGauche())) {
                result = true;
            }
        }
    }
    return result;
}