@java.lang.Override
public de.uni_freiburg.informatik.ultimate.automata.nestedword.operations.optncsb.util.IntSet getSuccessorsCall(int letter) {
    if (super.getEnabledLettersCall().contains(letter)) {
        return super.getSuccessorsCall(letter);
    }else {
        de.uni_freiburg.informatik.ultimate.automata.nestedword.operations.optncsb.util.IntSet succs = mBuchi.computeSuccessorsCall(de.uni_freiburg.informatik.ultimate.automata.nestedword.operations.optncsb.StateNWA2.getId(), letter);
        de.uni_freiburg.informatik.ultimate.automata.nestedword.operations.optncsb.util.IntIterator iter = succs.iterator();
        while (iter.hasNext()) {
            super.addSuccessorCall(letter, iter.next());
        } 
        return succs;
    }
}