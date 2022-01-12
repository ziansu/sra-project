private void balanceTwoPagesRoot() {
    if (((offspringPages[0].size) + (offspringPages[1].size)) < (nodes.length)) {
        mergeRoot();
    }else {
        int minNodes = ((nodes.length) * 2) / 3;
        if ((offspringPages[0].size) < minNodes) {
            rotateLeft(0);
        }else
            if ((offspringPages[1].size) < minNodes) {
                rotateRight(0);
            }
        
    }
}