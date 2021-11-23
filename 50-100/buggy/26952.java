@java.lang.Override
public void updateItem(javafx.scene.image.Image item, boolean empty) {
    if (item != null) {
        javafx.scene.layout.VBox vb = new javafx.scene.layout.VBox();
        vb.setAlignment(javafx.geometry.Pos.CENTER);
        java.lang.System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFff");
        img.setImage(item);
        img.setFitHeight(50);
        img.setFitWidth(75);
        vb.getChildren().addAll(img);
        setGraphic(vb);
    }else {
        java.lang.System.out.println("SSSSSSSSSSSSSSSSSSSS");
        img.setImage(null);
    }
}