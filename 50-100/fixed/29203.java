public void deleteCar(agents.StandartCar car) {
    int k = -1;
    for (int i = 0; i < (this.arrCar.size()); i++) {
        if (car.equals(this.arrCar.get(i))) {
            k = i;
        }
    }
    if (k != (-1)) {
        this.arrCar.remove(k);
    }
}