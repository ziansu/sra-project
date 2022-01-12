private void updateNails() {
    int size = mNailsRotateList.size();
    float rotate;
    for (int i = 0; i < size; i++) {
        rotate = mNailsRotateList.get(i);
        if (mIsRotateClockwise) {
            rotate += mMinAngle;
            if (rotate >= 360) {
                rotate -= 360;
            }
        }else {
            rotate -= mMinAngle;
            if (rotate <= 0) {
                rotate += 360;
            }
        }
        mNailsRotateList.set(i, rotate);
    }
}