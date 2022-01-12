@java.lang.Override
public void receivePictures(java.util.List<DATA.model.Picture> pictures, int queryId) {
    javafx.fxml.Initializable controller = app.getRequests().get(queryId);
    if (controller == null) {
    }else {
        if (controller instanceof IHM.controllers.TabbedPicturesSubController) {
            ((IHM.controllers.TabbedPicturesSubController) (controller)).addPictures(pictures);
        }
    }
}