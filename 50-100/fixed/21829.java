public void getCampus(javafx.scene.control.ChoiceBox<java.lang.String> cb, javafx.scene.control.TextArea ta, javafx.scene.layout.BorderPane bp) {
    switch (cb.getValue()) {
        case "Brownsville" :
            bp.setStyle("-fx-background-image: url(itemsReq/BROW.png); -fx-background-size: cover; -fx-background-repeat: no-repeat;");
            bsi.bkstrBROW(ta, bp);
            break;
        case "Edinburg" :
            bp.setStyle("-fx-background-image: url(itemsReq/EDIN.png); -fx-background-size: cover; -fx-background-repeat: no-repeat;");
            bsi.bkstrEDIN(ta, bp);
            break;
        default :
            bp.setStyle("-fx-background-image: url(itemsReq/oBG.gif); -fx-background-size: contain; -fx-background-position: center; -fx-background-repeat: no-repeat;");
            break;
    }
}