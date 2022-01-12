@java.lang.Override
public javafx.scene.control.ListCell<repertuar.model.Film> call(javafx.scene.control.ListView<repertuar.model.Film> param) {
    return new javafx.scene.control.ListCell<repertuar.model.Film>() {
        @java.lang.Override
        protected void updateItem(repertuar.model.Film item, boolean b) {
            super.updateItem(item, b);
            if (item != null) {
                textProperty().bind(item.titleProperty());
            }else {
                textProperty().unbind();
                textProperty().set("");
            }
        }
    };
}