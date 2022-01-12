public boolean isHasIncidence() {
    java.lang.System.out.println(getComputerNum());
    this.computerGateway.find(getComputerNum(), getLaboratory());
    if (((this.computerGateway.getCurrent()) != null) && ((this.computerGateway.getCurrent().getState()) == (es.uvigo.esei.infraestructura.entities.State.INCIDENCE))) {
        java.lang.System.out.println("TENGO INCIDENCIA");
        return true;
    }
    java.lang.System.out.println("NO TENGO INCIDENCIA");
    return false;
}