private void updateNails() {
    int size = mNailsRotateList.size();
    float rotate;
    for (int i = 0; i < size; i++) {
        rotate = mNailsRotateList.get(i);
        if (mIsRotateClockwise) {
            if (rotate == 360) {
                rotate = 0;
            }
            rotate += mMinAngle;
        }else {
            if (rotate == 0) {
                rotate = 360;
            }
            rotate -= mMinAngle;
        }
        mNailsRotateList.set(i, rotate);
    }
}