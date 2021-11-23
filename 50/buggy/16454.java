public int getBlockChainHeight() {
    if ((allTalkers.size()) != 0) {
        return blockChainHeight;
    }else {
        return blockHeight;
    }
}