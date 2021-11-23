@java.lang.Override
public void evaluate() {
    runChildren(getNonIgnoredFilteredChildren(), notifier, true);
}