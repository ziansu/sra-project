@java.lang.Override
public javafx.scene.paint.Color getPixelColor(javafx.scene.paint.Color color) {
    return new javafx.scene.paint.Color(((javafx.scene.paint.Color.RED.getRed()) - (color.getRed())), ((javafx.scene.paint.Color.GREEN.getGreen()) - (color.getGreen())), ((javafx.scene.paint.Color.BLUE.getBlue()) - (color.getBlue())), color.getOpacity());
}