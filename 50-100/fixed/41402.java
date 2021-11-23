public parking.beans.document.Account registerUser(parking.beans.document.Account user, java.lang.Integer number, javax.servlet.http.HttpServletRequest request) throws parking.exceptions.ApplicationException {
    parking.beans.document.Account createdAccount = userService.createUser(user, request);
    if (java.util.Optional.ofNullable(number).isPresent()) {
        userService.attachParking(createdAccount, number, request);
        parking.beans.document.ParkingLot attachedParking = parkingService.getParkingByNumber(number, request);
        parkingService.setOwner(createdAccount, attachedParking);
    }
    return createdAccount;
}