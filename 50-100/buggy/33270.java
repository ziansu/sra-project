@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(object instanceof com.gabriel.missingdogpoc.Dog)) {
        return false;
    }
    com.gabriel.missingdogpoc.Dog other = ((com.gabriel.missingdogpoc.Dog) (object));
    if ((((this.idDog) == null) && ((other.idDog) != null)) || (((this.idDog) != null) && (!(this.idDog.equals(other.idDog))))) {
        return false;
    }
    return true;
}