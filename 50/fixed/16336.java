@java.lang.Override
public void notifyResult(dkostiuchenko.trycatch.chesschallenge.chess.Board b, boolean isIndependent) {
    (totalPermutations)++;
    if (isIndependent) {
        (independentPermutations)++;
    }
}