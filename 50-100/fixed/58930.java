public void createNew() {
    if (((selectedDto) instanceof com.bics.fcitrack.model.AbstractModel) && ((((com.bics.fcitrack.model.AbstractModel) (selectedDto)).getRelease()) == null)) {
        com.bics.fcitrack.utils.FacesUtils.error("Realise is not selected.");
        return ;
    }
    try {
        getService().create(selectedDto);
    } catch (java.lang.Exception e) {
        com.bics.fcitrack.utils.FacesUtils.error("Error. Entity was not created.");
        e.printStackTrace();
    }
    selectedDto = getNewDto();
}