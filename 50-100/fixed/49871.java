public void moveBucket(int pos) {
    if (pos == 1)
        this.bucketTilt.moveToPosition(0);
    else
        if (pos == 0)
            this.bucketTilt.moveToPosition(0.5);
        else
            this.bucketTilt.moveToPosition(1);
        
    
}