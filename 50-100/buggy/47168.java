public void changeDestination(double probability) {
    if (!(waiting)) {
        if ((rand.nextDouble()) < probability) {
            currentDestination = (rand.nextInt(this.halfFloorFormula())) + (this.halfFloorFormula());
            if ((this.currentDestination) != (this.currentFloor)) {
                this.call();
            }
        }
    }
}