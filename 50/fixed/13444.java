@org.junit.Test(expected = org.jabref.logic.bibtex.InvalidFieldValueException.class)
public void reportUnbalancedBracing() throws java.lang.Exception {
    java.lang.String unbalanced = "{";
    formatter.format(unbalanced, "anyfield");
}