public void updatePic(int d) {
    if (d < 0) {
        xImHead = ((xImHead) + (moveSize)) % (width);
    }else
        if (d > 0) {
            xImHead = ((xImHead) - (moveSize)) % (width);
        }
    
}