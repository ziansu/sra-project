private void updateUnmatched(group3.MovingBlob movingBlob) {
    int maxTimeOffScreen = 30;
    if ((movingBlob.ageOffScreen) > maxTimeOffScreen) {
        movingBlobs.remove(movingBlob);
    }else {
        movingBlob.centerX += movingBlob.velocityX;
        movingBlob.centerY += movingBlob.velocityY;
        (movingBlob.age)++;
        (movingBlob.ageOffScreen)++;
        movingBlob.updatePredictedPosition();
    }
}