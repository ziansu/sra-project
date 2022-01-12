public java.lang.String getOutput(java.lang.String name) throws logistics.utilities.exceptions.NullParameterException {
    if (name.isEmpty())
        throw new logistics.utilities.exceptions.NullParameterException("Facility name cannot be empty string");
    
    logistics.facilityservice.Facility facility = facilityHashMap.get(name);
    return facility.toString();
}