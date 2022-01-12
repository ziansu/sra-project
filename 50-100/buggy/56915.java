public void visualizeORF(int selectedRF, int selectedHeader) {
    char[] temporalRF;
    if (selectedRF <= 3) {
        temporalRF = sequenceList.get((selectedHeader - 1)).toCharArray();
        ORFBuilder(temporalRF, selectedRF);
    }else {
        temporalRF = sequenceList.get((selectedHeader - 1)).toCharArray();
        ORFBuilder(makeComplementary(temporalRF).toCharArray(), selectedRF);
    }
}