@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(object instanceof com.gabriel.missingdogpoc.Dog)) {
        return false;
    }
    com.gabriel.missingdogpoc.Dog other = ((com.gabriel.missingdogpoc.Dog) (object));
    if ((((this.id) == null) && ((other.id) != null)) || (((this.id) != null) && (!(this.id.equals(other.id))))) {
        return false;
    }
    return true;
}