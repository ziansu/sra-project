@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj != null) && (obj instanceof model.curve.Grade)) {
        return name.equals(((model.curve.Grade) (obj)).getName());
    }
    return false;
}