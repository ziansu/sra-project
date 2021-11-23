@java.lang.Override
public STATE getOrConstructResultState(final STATE inputState) {
    final de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.util.IBlock<STATE> block = mPartition.getBlock(inputState);
    return mConstructionCache.getOrConstruct(block);
}