@java.lang.Override
public int compare(android.hardware.Camera.Size a, android.hardware.Camera.Size b) {
    return ((a.width) * (a.height)) - ((b.width) * (b.height));
}