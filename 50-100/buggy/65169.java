public boolean checkVerticalSpot(ai.partB.Position ps) {
    int tempX = ps.getX();
    int tempY = ps.getY();
    if (((tempX >= (dimension)) || (tempY >= (dimension))) || (tempX < 0)) {
        return false;
    }else
        if (tempY < 0) {
            return true;
        }else
            if ((myWorld[tempX][tempY]) instanceof ai.partB.BlankSpace) {
                return true;
            }else {
                return false;
            }
        
    
}