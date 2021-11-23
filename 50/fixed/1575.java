public void pixelate(int cols) {
    if (cols == 0)
        return ;
    
    this.cols = cols;
    render = true;
    this.invalidate();
}