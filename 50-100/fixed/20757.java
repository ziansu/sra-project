public int p2Right() {
    (p2Index)++;
    if (displayNeuhaus) {
        if (((p2Index) > 7) && ((p2Index) < 10)) {
            p2Index = 10;
        }else
            if ((p2Index) > 10) {
                p2Index = 0;
            }
        
    }else {
        if ((p2Index) > 7) {
            p2Index = 0;
        }
    }
    return p2Index;
}