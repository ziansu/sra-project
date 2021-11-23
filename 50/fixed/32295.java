@java.lang.Override
public void visitEntry(int index, double value) {
    int numberOfOccurencesOfWord = edu.byu.nlp.util.Integers.fromDouble(value, Datasets.INT_CAST_THRESHOLD);
    for (int i = 0; i < numberOfOccurencesOfWord; i++) {
        words.add(index);
    }
}