java.lang.String getReservedUrnNbn(java.lang.String registrarCode, cz.nkp.urnnbn.api.v3.pojo.Credentials credentials) {
    cz.nkp.urnnbn.api.v3.pojo.UrnNbnReservations urnNbnReservations = getUrnNbnReservations(registrarCode);
    if (!(urnNbnReservations.reservedOffered.isEmpty())) {
        return urnNbnReservations.reservedOffered.get(0);
    }else {
        return reserveUrnNbns(registrarCode, USER).get(0);
    }
}