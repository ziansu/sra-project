public int[] getBottomRightCoord() {
    if ((gridLeftRow) > (gridRightRow)) {
        return new int[]{ this.gridLeftRow , this.gridLeftCol };
    }else
        return new int[]{ this.gridRightRow , this.gridRightCol };
    
}