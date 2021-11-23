@java.lang.Override
public boolean equals(java.lang.Object obj) {
    model.curve.Curve other = ((model.curve.Curve) (obj));
    for (model.curve.Grade grade : curve) {
        if (!(other.curve.contains(grade))) {
            return false;
        }
    }
    return true;
}