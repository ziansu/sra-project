public int getStars() {
    int remScore = 0;
    int star = 0;
    remScore = this.bullpen.getTiles().size();
    if (remScore == 2) {
        star = 1;
    }else
        if (remScore == 1) {
            star = 2;
        }else
            if (remScore == 0) {
                star = 3;
            }
        
    
    if (star > 0) {
        isComplete = true;
    }
    return star;
}