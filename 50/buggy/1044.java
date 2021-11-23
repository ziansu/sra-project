@java.lang.Override
public int compare(android.hardware.Camera.Size a, android.hardware.Camera.Size b) {
    return ((b.width) * (b.height)) - ((a.width) * (a.height));
}