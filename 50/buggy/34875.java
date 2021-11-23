public void setClickThreshold(float clickThreshold) {
    if ((clickThreshold < 0) || (clickThreshold > 1.0F))
        android.util.Log.e(TAG, "clickThreshold must range from 0...1.0f inclusive");
    else
        this.clickThreshold = clickThreshold;
    
}