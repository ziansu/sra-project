@java.lang.Override
public boolean apply(java.lang.String input) {
    return java.util.Arrays.equals(input.getBytes(), expected.readFor(com.google.common.base.Optional.<com.github.dreamhead.moco.HttpRequest>absent()));
}