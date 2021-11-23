private boolean isSimilarHelper(de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.MinimizeSevpa<LETTER, STATE>.Partition partition, LETTER letter, STATE lin, STATE hier, de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.MinimizeSevpa<LETTER, STATE>.EquivalenceClass equivalenceClass) {
    if ((mDoubleDecker.isDoubleDecker(lin, hier)) && (!(checkExistenceOfSimilarTransition(partition, partition.succReturn(lin, hier, letter), equivalenceClass)))) {
        return false;
    }
    return true;
}