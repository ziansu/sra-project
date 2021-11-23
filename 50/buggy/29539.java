public void setBorderColor(int position, float color) {
    if ((mHost) == null) {
        return ;
    }
    getOrCreateViewBackground().setBorderColor(position, color);
}