private void defaultTargetTestsToGroupNameIfNoValueSet() {
    if ((this.getTargetTests()) == null) {
        this.targetTests = org.pitest.maven.ScmMojo.makeConcreteList(java.util.Collections.singletonList(((this.getProject().getGroupId()) + "*")));
    }
}