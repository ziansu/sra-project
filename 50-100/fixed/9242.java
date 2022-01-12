public void killChain(int index, tsumegoai.Stone color) {
    if ((index < 0) || ((searchSpace[index]) == null))
        return ;
    
    if ((searchSpace[index]) == color) {
        searchSpace[index] = null;
        updateZhash(tsumegoai.Goban.searchSpacePositions[index], color);
        for (int i = 0; i < 4; i++) {
            killChain(tsumegoai.Goban.searchSpaceAdjacentIndices[((4 * index) + i)], color);
        }
    }
}