@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (((this) == (examples.Buggy.BuggyEqualsTransitive.one)) && (o == (examples.Buggy.BuggyEqualsTransitive.two))) {
        return true;
    }
    if (((this) == (examples.Buggy.BuggyEqualsTransitive.two)) && (o == (examples.Buggy.BuggyEqualsTransitive.three))) {
        return true;
    }
    if (((this) == (examples.Buggy.BuggyEqualsTransitive.one)) && (o == (examples.Buggy.BuggyEqualsTransitive.three))) {
        return false;
    }
    return true;
}