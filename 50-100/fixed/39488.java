protected void onPostExecute(android.graphics.drawable.Drawable result) {
    super.onPostExecute(result);
    if (result != null) {
        this.mImageView.setImageDrawable(result);
        (doneCounter)++;
        java.lang.System.out.println(doneCounter);
        if ((doneCounter) == (i)) {
            done = true;
        }
    }
    if ((this.mOnAnimationFrameChangedListener) != null) {
        this.mOnAnimationFrameChangedListener.onAnimationFrameChanged(this.mIndex);
    }
}