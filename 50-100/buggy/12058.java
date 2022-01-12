public static logic.Facilities getFacility(java.lang.String facilityName) {
    logic.Facilities[] name = logic.Facilities.values();
    for (logic.Facilities facility : name) {
        if (facility.getValue().trim().equals(facilityName)) {
            return facility;
        }
    }
    return logic.Facilities.SELECT;
}