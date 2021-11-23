public int getRGB(int x, int y) {
    if ((((0 <= x) && (x < (width))) && (0 <= y)) && (y < (height)))
        return img.getRGB(x, y);
    else
        return -1;
    
}