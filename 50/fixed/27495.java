private static boolean fragmentsAreConsistent(com.google.gwt.dev.jjs.impl.codesplitter.Fragment thisFragment, com.google.gwt.dev.jjs.impl.codesplitter.Fragment thatFragment) {
    return ((thisFragment == null) || (thisFragment == thatFragment)) || (!(thatFragment.isExclusive()));
}