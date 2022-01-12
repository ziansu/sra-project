@android.support.annotation.NonNull
public static java.lang.String pixelColorInHex(java.lang.Integer pixel) {
    java.lang.String red = java.lang.Integer.toHexString(android.graphics.Color.red(pixel)).toUpperCase();
    java.lang.String green = java.lang.Integer.toHexString(android.graphics.Color.green(pixel)).toUpperCase();
    java.lang.String blue = java.lang.Integer.toHexString(android.graphics.Color.blue(pixel)).toUpperCase();
    return (((("#" + red) + "|") + green) + "|") + blue;
}