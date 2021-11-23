@java.lang.Override
public void notifyResult(dkostiuchenko.trycatch.chesschallenge.chess.Board b, boolean isIndependent) {
    totalPermutations.incrementAndGet();
    if (isIndependent) {
        independentPermutations.incrementAndGet();
    }
}