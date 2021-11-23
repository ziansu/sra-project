@java.lang.Override
public void dispose() {
    surfaceData = null;
    peer = null;
    validate(null);
    super.dispose();
}