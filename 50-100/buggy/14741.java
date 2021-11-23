@java.lang.Override
public boolean equals(java.lang.Object another) {
    if ((another.getClass()) != (this.getClass())) {
        return false;
    }
    com.rida.agents.Driver.DriverDescription other = ((com.rida.agents.Driver.DriverDescription) (another));
    if ((this.name.equals(other.name)) && (this.way.equals(other.way))) {
        return true;
    }
    return false;
}