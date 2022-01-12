@java.lang.Override
public void it(java.lang.String text, com.github.paulcwarren.ginkgo4j.ExecutableBlock block, boolean isFocused) {
    if (filter.equals(text)) {
        filter = splitFilter(filter, text);
        try {
            chain.setSpec(block);
            chain.setIsFocused((isFocused |= chain.isFocused()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}