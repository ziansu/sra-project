@java.lang.Override
public java.lang.Boolean visitField(@org.antlr.v4.runtime.misc.NotNull
antlrGen.MyExprParser.FieldContext ctx) {
    java.lang.System.out.println("visit field");
    java.util.ArrayList<java.lang.String> fieldList = new java.util.ArrayList<java.lang.String>();
    for (org.antlr.v4.runtime.tree.TerminalNode field : ctx.ID()) {
        fieldList.add(field.toString());
    }
    validator.FieldValidator validator = new validator.FieldValidator();
    return validator.validate(fieldList, this.selectedDomain);
}