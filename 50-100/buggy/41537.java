private void generateFieldIdMethod(final java.lang.StringBuilder sb, final uk.co.real_logic.sbe.ir.Token token, final java.lang.String indent) {
    sb.append(java.lang.String.format((((((((("\n" + indent) + "    public static int %sId()\n") + indent) + "    {\n") + indent) + "        return %d;\n") + indent) + "    }\n"), token.name(), java.lang.Integer.valueOf(token.id())));
}