@java.lang.Override
public void visitPhpField(final com.jetbrains.php.lang.psi.elements.Field field) {
    com.kalessil.phpStorm.phpInspectionsEA.inspectors.semanticalAnalysis.classes.lowerAccessLevel.strategy.ProtectedMembersOfFinalClassStrategy.apply(field, problemsHolder);
}