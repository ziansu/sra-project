public void addParcel(courier.ExpressCentre currExpressCentre) {
    int next;
    do {
        next = random.nextInt(expressCentres.size());
    } while (!(((expressCentres.get(next).stationID) != (currExpressCentre.stationID)) && (currExpressCentre.reachable(expressCentres.get(next)))) );
    currExpressCentre.pToBeSent.add(new courier.Parcel(serialParcelID, currExpressCentre, expressCentres.get(next), getNextInt(Car.maxSpace), this));
    (serialParcelID)++;
}