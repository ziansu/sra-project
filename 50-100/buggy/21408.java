@java.lang.Override
public void visitMethod(org.sonar.plugins.java.api.tree.MethodTree tree) {
    java.util.List<org.sonar.plugins.java.api.tree.ModifierKeywordTree> modifiers = tree.modifiers().modifiers();
    for (org.sonar.plugins.java.api.tree.ModifierKeywordTree modifier : modifiers) {
        if ((modifier.modifier()) == (org.sonar.plugins.java.api.tree.Modifier.SYNCHRONIZED)) {
            visitor.reportIssue(tree, com.cognifide.aemrules.checks.SynchornizedKeywordUsageCheck.MESSAGE);
        }
    }
    super.visitMethod(tree);
}