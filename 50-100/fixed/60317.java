private void defaultTargetTestsToGroupNameIfNoValueSet() {
    if (((this.getTargetTests()) == null) || (this.getTargetTests().isEmpty())) {
        this.targetTests = org.pitest.maven.ScmMojo.makeConcreteList(java.util.Collections.singletonList(((this.getProject().getGroupId()) + "*")));
    }
}