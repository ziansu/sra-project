public void setProgress(int progress) {
    if ((progress >= 0) && (progress <= 100)) {
        this.progress = progress;
        progressChangeListener.onProgressChange(progress);
        invalidate();
    }else
        if (progress < 0) {
            this.progress = 0;
            invalidate();
        }else
            if (progress > 100) {
                this.progress = 100;
                invalidate();
            }
        
    
}