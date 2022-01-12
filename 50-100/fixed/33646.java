@java.lang.Override
public boolean filterResult(long resultNode, com.twitter.graphjet.hashing.SmallArrayBasedLongToDoubleMap[] socialProofs) {
    int totalNumProofs = 0;
    for (java.lang.Byte validType : validSocialProofType) {
        if ((socialProofs[validType]) != null) {
            totalNumProofs += socialProofs[validType].size();
        }
    }
    return totalNumProofs != (exactNumUserSocialProof);
}