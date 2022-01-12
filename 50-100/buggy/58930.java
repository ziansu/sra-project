public void createNew() {
    if (((selectedDto) instanceof com.bics.fcitrack.model.AbstractModel) && ((((com.bics.fcitrack.model.AbstractModel) (selectedDto)).getRelease()) != null)) {
        try {
            getService().create(selectedDto);
        } catch (java.lang.Exception e) {
            com.bics.fcitrack.utils.FacesUtils.error("Error. Entity was not created.");
            e.printStackTrace();
        }
        selectedDto = getNewDto();
    }else {
        com.bics.fcitrack.utils.FacesUtils.error("Realise is not selected.");
    }
}