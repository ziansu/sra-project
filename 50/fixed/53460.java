public void subtractGold(int gold) {
    if (gold > (this.gold)) {
        throw new com.augustalso.bd.NotEnoughGoldException();
    }else {
        this.gold -= gold;
    }
}