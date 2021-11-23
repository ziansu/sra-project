private static <T> boolean isLiveInFragment(java.util.Map<T, com.google.gwt.dev.jjs.impl.codesplitter.Fragment> map, T atom, com.google.gwt.dev.jjs.impl.codesplitter.Fragment expectedFragment) {
    com.google.gwt.dev.jjs.impl.codesplitter.Fragment actualFragment = com.google.gwt.dev.jjs.impl.codesplitter.ExclusivityMap.getFragment(map, atom);
    return (expectedFragment == actualFragment) || (!(actualFragment.isExclusive()));
}