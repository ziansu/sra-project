private void computeTwoCMPProjectionConstraintMatrices() {
    tmpTwoCMPProjection_Aeq.zero();
    tmpTwoCMPProjection_beq.zero();
    tmpTwoCMPProjection_Aeq.reshape(totalFootstepVariables, numberOfFootstepsToConsider);
    tmpTwoCMPProjection_beq.reshape(numberOfFootstepsToConsider, 1);
    for (int i = 0; i < (numberOfFootstepsToConsider); i++) {
        tmpTwoCMPProjection_Aeq.set((3 * i), i, 1.0);
        tmpTwoCMPProjection_beq.set(i, 1, 1.0);
    }
}