public void changeDestination(double probability) {
    if (!(waiting)) {
        if ((rand.nextDouble()) < probability) {
            this.currentDestination = rand.nextInt(((elevator.Building.getNumberOfFloors()) - 1));
            if ((this.currentDestination) != (this.currentFloor)) {
                this.call();
            }
        }
    }
}