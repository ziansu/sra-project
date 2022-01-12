public int p2Left() {
    (p2Index)--;
    if (displayNeuhaus) {
        if ((p2Index) == (-1)) {
            p2Index = 10;
        }else
            if ((p2Index) == 10) {
                p2Index = 7;
            }
        
    }else {
        if ((p2Index) < 0) {
            p2Index = 7;
        }
    }
    return p2Index;
}