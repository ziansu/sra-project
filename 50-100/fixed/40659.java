protected void writeBlob(model.platform.Blob blob, java.awt.Point coordinates) {
    java.awt.Point old;
    synchronized(blobs) {
        old = blobs[blob.ordinal()];
        blobs[blob.ordinal()] = coordinates;
    }
    if ((old.equals(coordinates)) == false) {
        notifySubscribers(blob);
    }
}