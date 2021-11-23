public int p1Right() {
    (p1Index)++;
    if (displayNeuhaus) {
        if ((p1Index) == 8) {
            p1Index = 10;
        }else
            if ((p1Index) == 10) {
                p1Index = 0;
            }
        
    }else {
        if ((p1Index) > 7) {
            p1Index = 0;
        }
    }
    return p1Index;
}