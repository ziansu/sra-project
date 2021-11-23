public void startProduction() {
    javafx.scene.layout.Pane temp = canvas;
    scene.setOnKeyPressed(null);
    holder.getChildren().clear();
    instructions.setText("Production started!");
    debug.setText("");
    holder.getChildren().addAll(temp, text, stats);
    currentSprite.remove(temp);
    map.produce(temp);
    updateAllStats();
}