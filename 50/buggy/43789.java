private android.graphics.Point convertSizeToLandscapeOrientation(android.graphics.Point size) {
    if (((getDisplaySurfaceOrientation()) % 180) != 0) {
        return size;
    }else {
        return new android.graphics.Point(size.y, size.x);
    }
}