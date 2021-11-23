public void setDefense(int defense) {
    if (defense < 0) {
        this.defense = 0;
    }else {
        this.defense = defense;
    }
}