public void visualizeORF(int selectedRF, int selectedHeader) {
    char[] temporalRF;
    if (selectedRF <= 3) {
        temporalRF = sequenceList.get(selectedHeader).toCharArray();
        ORFBuilder(temporalRF, selectedRF);
    }else {
        temporalRF = sequenceList.get(selectedHeader).toCharArray();
        ORFBuilder(makeComplementary(temporalRF).toCharArray(), selectedRF);
    }
}