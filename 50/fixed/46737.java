public void setHeight(int height) {
    if (height == (mHeight))
        return ;
    
    if (height < 0) {
        mHeight = 0;
    }else {
        mHeight = height;
        needsLineUpdate = true;
    }
}