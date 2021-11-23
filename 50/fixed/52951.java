void assertEndsWith(org.assertj.core.api.AssertionInfo info, org.assertj.core.internal.Failures failures, java.lang.Object actual, java.lang.Object first, java.lang.Object[] rest) {
    java.lang.Object[] sequence = org.assertj.core.util.Arrays.prepend(first, rest);
    assertEndsWith(info, failures, actual, sequence);
}