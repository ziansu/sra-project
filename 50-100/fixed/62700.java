static void iterateLetterCombos() {
    for (int i = 0; i < ((TwoByThree.abcs.size()) - 1); i++) {
        for (int j = i + 1; j < (TwoByThree.abcs.size()); j++) {
            TwoByThree.tryCombinations(TwoByThree.abcs.get(i), TwoByThree.abcs.get(j));
        }
    }
}