public synchronized void incomingCar(data.analytics.smart.traffic.model.movement.CardinalDirection from, data.analytics.smart.traffic.model.Car car) {
    if (light.isGreen(from)) {
        java.lang.System.out.println("Its already green");
    }else {
        java.util.List<data.analytics.smart.traffic.model.Car> carList = waitinglist.get(from);
        carList.add(car);
        waitinglist.put(from, carList);
        java.lang.System.out.println((("Car from " + from) + "has to wait in line"));
    }
}