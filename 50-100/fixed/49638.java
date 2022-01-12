@java.lang.Override
public void prepare() {
    if ((((userMode) != null) && (!(userMode.isEmpty()))) && ((userMode.equalsIgnoreCase(org.egov.tl.web.actions.masters.EDIT)) || (userMode.equalsIgnoreCase(org.egov.tl.web.actions.masters.UnitOfMeasurementAction.VIEW))))
        setLicenseUomMap(org.egov.tl.web.actions.masters.UnitOfMeasurementAction.getFormattedUOMMap(unitOfMeasurementService.findAll()));
    
    if ((getId()) != null)
        unitOfMeasurement = unitOfMeasurementService.findById(getId());
    
}