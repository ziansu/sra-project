public static long proofOfWork(final long previousProof) {
    long proof = 0;
    while (!(com.blockchain.java.domain.Block.validProof(previousProof, proof))) {
        proof++;
    } 
    return proof;
}