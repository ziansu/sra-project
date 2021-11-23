private void generateFieldIdMethod(final java.lang.StringBuilder sb, final uk.co.real_logic.sbe.ir.Token token, final java.lang.String indent) {
    sb.append(java.lang.String.format((("\n" + indent) + "    public const int %sId = %d;\n"), uk.co.real_logic.sbe.generation.csharp.CSharpUtil.CSharpUtil.formatPropertyName(token.name()), token.id()));
}