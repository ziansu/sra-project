public void run() {
    if ((message.getData("line").equals("You lose !")) || (message.getData("line").equals("Draw !"))) {
        btns[java.lang.Integer.parseInt(message.getData("x"))][java.lang.Integer.parseInt(message.getData("y"))].setGraphic(new javafx.scene.image.ImageView((IAmX ? "/resources/images/o.png" : "/resources/images/x.png")));
    }
}