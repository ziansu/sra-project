@java.lang.Override
public javafx.scene.paint.Color getPixelColor(javafx.scene.paint.Color color) {
    return new javafx.scene.paint.Color((1.0 - (color.getRed())), (1.0 - (color.getGreen())), (1.0 - (color.getBlue())), color.getOpacity());
}