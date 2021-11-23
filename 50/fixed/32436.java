@java.lang.Override
public boolean parseStatementWithImports(com.intellij.lang.PsiBuilder builder) {
    return (org.jetbrains.plugins.groovy.lang.parser.parsing.statements.imports.ImportStatement.parse(builder, this)) || (parseStatement(builder, false));
}