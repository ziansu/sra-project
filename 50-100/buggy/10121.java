@java.lang.Override
public boolean equals(final java.lang.Object obj) {
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
    if ((id) != (other.id)) {
        return false;
    }
    return true;
}