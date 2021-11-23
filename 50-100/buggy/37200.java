@java.lang.Override
public boolean equals(java.lang.Object vk) {
    if ((vk.getClass()) == (this.getClass())) {
        com.shuffle.bitcoin.VerificationKey oKey = ((com.shuffle.bitcoin.VerificationKey) (vk));
        return ((this.address()) == (oKey.address())) && ((oKey.getClass()) == (this.getClass()));
    }
    return false;
}