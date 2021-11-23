java.lang.String toGraphViz() {
    if ((end) == null) {
        return (((("   " + (start.toString())) + " [label=\"") + (getCommonStringSequence())) + (getWeight())) + "\"]";
    }
    return (((((("   " + (start.toString())) + " -> ") + (end.toString())) + " [label=\"") + (getCommonStringSequence())) + (getWeight())) + "\"]";
}