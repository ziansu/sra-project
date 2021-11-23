public java.lang.String load(final javafx.stage.Stage mainStage) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Load Circuit");
    fileChooser.getExtensionFilters().addAll(new javafx.stage.FileChooser.ExtensionFilter("Json", "*.json"));
    java.io.File file = fileChooser.showOpenDialog(mainStage);
    last_file_saved = file;
    java.lang.String json_string = file_read(file);
    return new com.google.gson.Gson().fromJson(json_string, new com.google.gson.reflect.TypeToken<java.util.List<?>>() {    }.getType());
}