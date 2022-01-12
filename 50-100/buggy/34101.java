public void standInLine(car.Management.Car car) {
    if ((((car instanceof car.Management.Logan) || (car instanceof car.Management.Duster)) || (car instanceof car.Management.Astra)) || (car instanceof car.Management.Insignia)) {
        this.carStand.add(car);
    }else {
        java.lang.System.out.println((("Invalid car type " + car) + " not added to list"));
    }
}