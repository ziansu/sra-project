private static long[] getPseudoClassStatesForTransition(javafx.scene.Node node, int count) {
    if (node == null)
        return new long[count];
    
    long[] states = com.sun.javafx.css.StyleHelper.getPseudoClassStatesForTransition(node.getParent(), (++count));
    com.sun.javafx.css.StyleHelper helper = node.impl_getStyleHelper();
    states[(count - 1)] = ((helper.pseudoclassStateMask) != 0) ? (node.impl_getPseudoClassState()) & (helper.pseudoclassStateMask) : 0;
    return states;
}