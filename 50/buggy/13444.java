@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void reportUnbalancedBracing() {
    java.lang.String unbalanced = "{";
    formatter.format(unbalanced, "anyfield");
}