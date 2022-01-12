private void DoTheSort() {
    if ((sortStyle) == 1) {
        int imgWidth = AlphaCode.img.getWidth();
        int imgHeight = AlphaCode.img.getHeight();
        if ((sortDirection) == 1)
            sortHoriz(imgWidth, imgHeight, 0, 0);
        else
            sortVert(imgWidth, imgHeight, 0, 0);
        
    }else
        if ((sortStyle) == 2)
            tileSort();
        
    
}