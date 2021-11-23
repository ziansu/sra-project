private static boolean joinValuesIdentical(org.sosy_lab.cpachecker.cpa.smg.join.SMGJoinValues pJV, java.lang.Integer pV1, java.lang.Integer pV2) {
    if (((pV1 == pV2) && (!(pJV.getInputSMG1().isPointer(pV1)))) && (pJV.getInputSMG2().isPointer(pV2))) {
        pJV.value = pV1;
        pJV.defined = true;
    }
    return pV1.equals(pV2);
}