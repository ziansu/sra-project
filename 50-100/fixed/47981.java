public void loadAgencyTypesInGrid() {
    agencyTypeBL = new BusinessLayer.AgencyTypeBL();
    try {
        if ((grdAgencyType) != null) {
            removeComponent(grdAgencyType);
        }
        agencyTypes = agencyTypeBL.getAllAgencyTypes();
        container = new com.vaadin.data.util.BeanItemContainer<dao.domain.AgencyType>(dao.domain.AgencyType.class, agencyTypes);
        grdAgencyType = new com.vaadin.ui.Grid(container);
        addComponent(grdAgencyType);
        grdAgencyType.setSelectionMode(SelectionMode.SINGLE);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}