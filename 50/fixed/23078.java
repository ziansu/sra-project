public void bnot() {
    if (this.isZero()) {
        this.data = org.ethereum.util.ByteUtil.copyToArray(org.ethereum.vm.DataWord.MAX_VALUE);
        return ;
    }
    this.data = org.ethereum.util.ByteUtil.copyToArray(org.ethereum.vm.DataWord.MAX_VALUE.subtract(this.value()));
}