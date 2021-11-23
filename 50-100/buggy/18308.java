public boolean equals(java.lang.Object other) {
    if (other == null) {
        return false;
    }
    if (other == (this)) {
        return true;
    }
    if (!(other instanceof be.panako.strategy.nfft.storage.NFFTFingerprintHit)) {
        return false;
    }
    be.panako.strategy.nfft.storage.NFFTFingerprintHit otherFingerprintHit = ((be.panako.strategy.nfft.storage.NFFTFingerprintHit) (other));
    return (((otherFingerprintHit.identifier) == (this.identifier)) && ((otherFingerprintHit.matchTime) == (this.matchTime))) && ((otherFingerprintHit.queryTime) == (otherFingerprintHit.queryTime));
}