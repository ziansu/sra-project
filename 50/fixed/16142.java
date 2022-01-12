private static javafx.scene.image.Image generateRandomMathFace() {
    int randomIndex = ((int) (java.lang.Math.round(((java.lang.Math.random()) * ((org.xxxmathxxx.tddt.gui.hints.UsefulInfoNotification.faceImagePaths.length) - 1)))));
    return new javafx.scene.image.Image(org.xxxmathxxx.tddt.gui.hints.UsefulInfoNotification.faceImagePaths[randomIndex]);
}