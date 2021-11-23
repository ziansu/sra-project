private void computeTwoCMPProjectionConstraintMatrices() {
    for (int i = 0; i < (numberOfFootstepsToConsider); i++) {
        tmpTwoCMPProjection_Aeq.set((3 * i), i, 1.0);
        tmpTwoCMPProjection_beq.set(i, 0, 1.0);
    }
}