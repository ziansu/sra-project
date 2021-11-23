public void setCount(int count) {
    if (count > (this.maxCount)) {
        this.setCount((count - 1));
    }
    if (count < (this.minCount)) {
        this.setCount((count + 1));
    }
    this.count = count;
    super.setSwitchId((count - (this.minCount)));
}