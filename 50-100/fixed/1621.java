@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    model.curve.Curve other = ((model.curve.Curve) (obj));
    for (model.curve.Grade grade : curve) {
        if (!(other.curve.contains(grade))) {
            return false;
        }
    }
    return true;
}