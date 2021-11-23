public static org.web3j.rlp.RlpString create(byte[] value) {
    return new org.web3j.rlp.RlpString(org.web3j.utils.Bytes.trimLeadingZeroes(value));
}