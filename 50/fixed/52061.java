protected void onReleased() {
    if (this.mTouched) {
        this.mTouched = false;
        if ((this.mMapListener) != null) {
            this.mMapListener.onReleased();
        }
    }
}