@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    if ((widthMeasureSpec == 0) || (heightMeasureSpec == 0)) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }else
        if ((widthMeasureSpec == 0) || (heightMeasureSpec == 0)) {
            int size = java.lang.Math.max(widthMeasureSpec, heightMeasureSpec);
            super.onMeasure(size, size);
        }else {
            int size = java.lang.Math.min(widthMeasureSpec, heightMeasureSpec);
            super.onMeasure(size, size);
        }
    
}