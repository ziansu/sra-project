public void handelMouseMotion(javafx.scene.input.MouseEvent event) {
    showSideMenu = (event.getSceneX()) < ((scene.getWidth()) / 10);
    if ((!(showSideMenu)) && (showedSideMenu)) {
        mainGroup.getChildren().remove(sideMenu.get());
        showedSideMenu = false;
    }else
        if ((showSideMenu) && (!(showedSideMenu))) {
            mainGroup.getChildren().add(sideMenu.get());
            showedSideMenu = true;
        }
    
}