@java.lang.Override
public void visitPhpField(@org.jetbrains.annotations.NotNull
com.jetbrains.php.lang.psi.elements.Field field) {
    com.kalessil.phpStorm.phpInspectionsEA.inspectors.semanticalAnalysis.classes.lowerAccessLevel.strategy.ProtectedMembersOfFinalClassStrategy.apply(field, problemsHolder);
}