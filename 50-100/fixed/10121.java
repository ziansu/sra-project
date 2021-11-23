@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof fr.poulet4j.model.Cell)) {
        return false;
    }
    fr.poulet4j.model.Cell other = ((fr.poulet4j.model.Cell) (obj));
    if ((x) != (other.x)) {
        return false;
    }
    if ((y) != (other.y)) {
        return false;
    }
    return true;
}