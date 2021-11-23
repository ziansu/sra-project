private static imu.recommender.models.route.RouteModel CarTrip(imu.recommender.Recommender route) {
    imu.recommender.models.route.RouteModel cartrip = null;
    for (int i = 0; i < (route.getRoutes().size()); i++) {
        if (route.getRoutes().get(i).getRoute().getAdditionalInfo().get("mode").equals("car")) {
            cartrip = route.getRoutes().get(i);
        }
    }
    return cartrip;
}