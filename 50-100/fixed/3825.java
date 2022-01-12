void dispose() {
    if (doCleanDirty) {
        java.util.Arrays.fill(curCurvepts, 0.0F);
        java.util.Arrays.fill(firstSegmentsBuffer, 0.0F);
    }
    if ((recycleDashes) && ((dash) != (dashes_initial))) {
        rdrCtx.putDirtyFloatArray(dash);
    }
    if ((firstSegmentsBuffer) != (firstSegmentsBuffer_initial)) {
        rdrCtx.putDirtyFloatArray(firstSegmentsBuffer);
        firstSegmentsBuffer = firstSegmentsBuffer_initial;
    }
}