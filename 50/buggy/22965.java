public void restartScene(int numberOfFloors, int numberOfElevators) {
    cleanUpScene();
    initializeScene(numberOfFloors, numberOfElevators);
    this.numberOfFloors = numberOfFloors;
    this.numberOfElevators = numberOfElevators;
}