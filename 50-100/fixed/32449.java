private group2.Blob getBlob(group2.BlobDetection.BlobInProgress bip) {
    if (unusedBlobs.isEmpty()) {
        return new group2.Blob(bip.width(), bip.height(), bip.left, bip.top, bip.color);
    }else {
        group2.Blob blob = unusedBlobs.pop();
        blob.width = bip.width();
        blob.height = bip.height();
        blob.x = bip.left;
        blob.y = bip.top;
        blob.color = bip.color;
        return blob;
    }
}