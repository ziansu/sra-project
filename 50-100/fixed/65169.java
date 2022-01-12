public boolean checkVerticalSpot(ai.partB.Position ps) {
    int tempX = ps.getX();
    int tempY = ps.getY();
    if (tempX >= (dimension)) {
        return false;
    }else
        if (tempY == (dimension)) {
            return true;
        }else
            if ((tempX < 0) || (tempY < 0)) {
                return false;
            }else
                if ((myWorld[tempX][tempY]) instanceof ai.partB.BlankSpace) {
                    return true;
                }else {
                    return false;
                }
            
        
    
}