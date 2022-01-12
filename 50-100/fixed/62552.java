@java.lang.Override
public boolean equals(java.lang.Object o) {
    boolean result = false;
    if (o instanceof structure.Union) {
        structure.Union test = ((structure.Union) (o));
        if (getGauche().equals(test.getGauche())) {
            if (getDroit().equals(test.getDroit())) {
                result = true;
            }
        }
    }
    return result;
}