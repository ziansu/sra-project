java.lang.String getReservedUrnNbn(java.lang.String registrarCode, cz.nkp.urnnbn.api.v3.pojo.Credentials credentials) {
    cz.nkp.urnnbn.api.v3.pojo.UrnNbnReservations urnNbnReservations = getUrnNbnReservations(REGISTRAR);
    if (!(urnNbnReservations.reservedOffered.isEmpty())) {
        return urnNbnReservations.reservedOffered.get(0);
    }else {
        return reserveUrnNbns(REGISTRAR, USER).get(0);
    }
}