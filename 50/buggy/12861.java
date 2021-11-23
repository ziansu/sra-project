public void doAddComputer() {
    java.lang.System.out.println(this.labelNum);
    this.computerGateway.create(new es.uvigo.esei.infraestructura.entities.Computer(getLaboratory(), getComputerNum(), getLabelNum()));
    this.computerGateway.save();
}