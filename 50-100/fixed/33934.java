public void pushPedelecInavailability(java.lang.String pedelecManufacturerId) {
    java.util.List<java.lang.String> pedelecManufacturerIds = new java.util.ArrayList<>();
    de.rwth.idsg.bikeman.domain.Pedelec pedelec = pedelecRepository.findByManufacturerId(pedelecManufacturerId);
    if ((pedelec.getStationSlot()) == null) {
        return ;
    }
    pedelecManufacturerIds.add(pedelec.getManufacturerId());
    java.lang.String stationManufacturerId = pedelec.getStationSlot().getStation().getManufacturerId();
    pushInavailability(stationManufacturerId, pedelecManufacturerIds);
}