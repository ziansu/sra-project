public static logic.Facilities getFacility(java.lang.String facilityName) {
    logic.Facilities[] name = logic.Facilities.values();
    for (logic.Facilities facility : name) {
        if (facilityName.contains(facility.getValue())) {
            return facility;
        }
    }
    return logic.Facilities.SELECT;
}