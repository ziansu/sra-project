private void verifyVisibility(@javax.annotation.Nonnull
final edu.umd.cs.findbugs.ba.XMethod invokedMethod) {
    if ((checkVisibility(invokedMethod)) && (checkAnnotated(invokedMethod))) {
        final edu.umd.cs.findbugs.BugInstance bug = new edu.umd.cs.findbugs.BugInstance(this, "GUAVA_UNEXPECTED_ACCESS_TO_VISIBLE_FOR_TESTING", HIGH_PRIORITY);
        bug.addCalledMethod(this).addClassAndMethod(this).addSourceLine(this);
        bugReporter.reportBug(bug);
    }
}