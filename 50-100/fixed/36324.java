@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other instanceof travelAgencyModel.Bus) {
        travelAgencyModel.Bus otherBus = ((travelAgencyModel.Bus) (other));
        return ((((otherBus.getLicensePlate()) != null) && ((this.licensePlate) != null)) && (otherBus.getLicensePlate().equals(this.licensePlate))) || ((otherBus.getLicensePlate()) == (this.licensePlate));
    }
    return false;
}