public void doSelectComputer(int num) {
    this.computerNum = num;
    java.lang.System.out.println(this.computerNum);
    this.computerGateway.find(getComputerNum(), getLaboratory());
}