@java.lang.Override
public void beginTree(com.puppycrawl.tools.checkstyle.api.DetailAST rootAST) {
    currentFrame = new com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck.FieldFrame(null, true, null);
}