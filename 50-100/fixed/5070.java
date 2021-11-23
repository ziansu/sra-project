private void updateUiMedia(java.util.ArrayList<controller.Media> medias) {
    if (((medias.size()) > 0) && (!(medias.contains(null))))
        for (controller.Media media : medias)
            searchView.getItems().add(media.toString());
        
    else
        showErrorMessage("No match found");
    
}