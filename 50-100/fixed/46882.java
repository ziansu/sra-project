public java.util.List<group3.MovingBlob> reduce(java.util.List<group3.MovingBlob> blobs) {
    for (int i = 0; i < (blobs.size()); i++) {
        if (!(isPedestrian(blobs.get(i))))
            blobs.remove((i--));
        
    }
    return blobs;
}