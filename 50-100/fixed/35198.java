public void updateSelector(java.util.ArrayList<objects.Charakter> charakterTypes, sample.Controller c) {
    this.c = c;
    for (java.lang.Object obj : selectorsOnField) {
        gameSelector.getChildren().remove(obj);
    }
    selectorsOnField.clear();
    for (objects.Charakter type : charakterTypes) {
        javafx.scene.control.Button obj = createImageViewSelector(type);
        gameSelector.getChildren().add(obj);
        selectorsOnField.add(obj);
    }
}