@java.lang.Override
public boolean equals(java.lang.Object n) {
    boolean result = false;
    if (n instanceof structure.Conc) {
        structure.Conc test = ((structure.Conc) (n));
        if (getGauche().equals(test.getGauche())) {
            if (getDroit().equals(test.getDroit())) {
                result = true;
            }
        }
    }
    return result;
}