java.lang.String toGraphViz() {
    return (((((("   " + (start.toString())) + " -> ") + (end.toString())) + " [label=\"") + (getCommonStringSequence())) + (getWeight())) + "\"]";
}