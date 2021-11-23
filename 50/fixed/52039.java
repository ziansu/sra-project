protected boolean noCarIsComing(courier.ExpressCentre from, courier.ExpressCentre to) {
    for (courier.Car c : from.carPark) {
        if ((c.stationTo) != null)
            if (c.stationTo.equals(to))
                return false;
            
        
    }
    return true;
}