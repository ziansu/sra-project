private java.lang.Object[] getOptionsWithThrowable(final java.lang.Throwable throwable, final java.lang.Object[] options) {
    final java.lang.Object[] array = java.util.Arrays.copyOf(options, ((options.length) + 1));
    array[((array.length) - 1)] = throwable;
    return array;
}