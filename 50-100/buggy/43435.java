private void processMDtagCigarOperatorM() {
    int numMatches = currentCigarMDElement.getLength();
    totalMatches = (totalMatches) + numMatches;
    if (((currentPosition) + numMatches) >= (matchPos.length)) {
        extendDensityArrays();
    }
    for (int i = 0; i < numMatches; i++) {
        (matchPos[((currentPosition) + i)])++;
    }
    currentPosition = (currentPosition) + numMatches;
}