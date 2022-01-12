public void updateItem(com.github.jextractall.unpack.ExtractionResult result, boolean empty) {
    if (empty || (result == null)) {
        super.updateItem(result, empty);
        return ;
    }
    if ((result.getException()) != null) {
        imgV.setImage(errorImg);
        setTooltip(new javafx.scene.control.Tooltip(result.getException().getMessage()));
    }else {
        imgV.setImage(okImg);
        setTooltip(null);
    }
}