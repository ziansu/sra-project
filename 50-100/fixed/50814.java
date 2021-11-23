private void updateUnmatched(group3.MovingBlob movingBlob) {
    if ((movingBlob.ageOffScreen) > (maxTimeOffScreen)) {
        movingBlobs.remove(movingBlob);
    }else {
        movingBlob.x += movingBlob.velocityX;
        movingBlob.y += movingBlob.velocityY;
        (movingBlob.age)++;
        (movingBlob.ageOffScreen)++;
        movingBlob.updatePredictedPosition();
    }
}