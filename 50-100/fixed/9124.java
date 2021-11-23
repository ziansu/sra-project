public boolean isHasIncidence() {
    this.computerGateway.find(getComputerNum(), getLaboratory());
    if (((this.computerGateway.getCurrent()) != null) && ((this.computerGateway.getCurrent().getState()) == (es.uvigo.esei.infraestructura.entities.State.INCIDENCE))) {
        return true;
    }
    return false;
}