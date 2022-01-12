@java.lang.Override
protected boolean isTaggedWithIgnoringEagerness(final java.lang.Class<?> tag) {
    if (tag == (tools.dym.Tags.OpArithmetic.class)) {
        return true;
    }else {
        return super.isTaggedWithIgnoringEagerness(tag);
    }
}