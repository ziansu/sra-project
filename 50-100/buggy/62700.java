static void iterateLetterCombos() {
    for (int i = 0; i < (TwoByThree.abcs.size()); i++) {
        for (int j = 0; j < (TwoByThree.abcs.size()); j++) {
            if (i != j) {
                TwoByThree.tryCombinations(TwoByThree.abcs.get(i), TwoByThree.abcs.get(j));
            }
        }
    }
}