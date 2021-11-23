private void processMDtagCigarOperatorM() {
    int numMatches = currentCigarMDElement.getLength();
    totalMatches = (totalMatches) + numMatches;
    extendDensityArrays(((currentPosition) + numMatches));
    for (int i = 0; i < numMatches; i++) {
        (matchPos[((currentPosition) + i)])++;
    }
    currentPosition = (currentPosition) + numMatches;
}