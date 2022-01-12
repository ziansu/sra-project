private void verifyVisibility(edu.umd.cs.findbugs.classfile.ClassDescriptor invokedClass, edu.umd.cs.findbugs.ba.XMethod invokedMethod, boolean reportCaller) {
    if ((checkVisibility(invokedMethod)) && (checkAnnotated(invokedMethod))) {
        edu.umd.cs.findbugs.BugInstance bug = new edu.umd.cs.findbugs.BugInstance(this, "GUAVA_UNEXPECTED_ACCESS_TO_VISIBLE_FOR_TESTING", HIGH_PRIORITY);
        if (reportCaller) {
            bug.addCalledMethod(this).addClassAndMethod(this).addSourceLine(this);
        }
        bugReporter.reportBug(bug);
    }
}