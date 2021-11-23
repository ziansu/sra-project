public logistics.facilityservice.FacilityDTO getFacility(java.lang.String name) throws logistics.utilities.exceptions.NullParameterException {
    if (name.isEmpty())
        throw new logistics.utilities.exceptions.NullParameterException("Facility name cannot be empty string");
    
    logistics.facilityservice.Facility facility = facilityHashMap.get(name);
    if (facility == null)
        return null;
    
    return new logistics.facilityservice.FacilityDTO(facility.getName(), facility.getCost(), facility.getRate());
}