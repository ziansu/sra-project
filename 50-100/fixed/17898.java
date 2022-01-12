public void setCount(int count) {
    if (count > (this.maxCount)) {
        this.setCount((count - 1));
        return ;
    }
    if (count < (this.minCount)) {
        this.setCount((count + 1));
        return ;
    }
    this.count = count;
    super.setSwitchId((count - (this.minCount)));
}