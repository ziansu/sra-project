public void bnot() {
    if (this.isZero())
        return ;
    
    this.data = org.ethereum.util.ByteUtil.copyToArray(org.ethereum.vm.DataWord.MAX_VALUE.subtract(this.value()));
}