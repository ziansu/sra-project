public void setLandscape(boolean landscape) {
    this.mIsLandscape = mIsLandscape;
    if (this.mIsLandscape) {
        this.mTop = this.mGreen;
        this.mBottom = this.mBlue;
        this.mRight = this.mYellow;
        this.mLeft = this.mRed;
        return ;
    }
    this.mTop = this.mRed;
    this.mBottom = this.mYellow;
    this.mLeft = this.mBlue;
    this.mRight = this.mGreen;
}