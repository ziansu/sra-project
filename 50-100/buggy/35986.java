public int getRGB(int x, int y) {
    if ((((x <= 0) && (x < (width))) && (y <= 0)) && (y < (height)))
        return img.getRGB(x, y);
    else
        return -1;
    
}