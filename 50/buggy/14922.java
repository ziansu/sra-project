public void typeCheck(org.overture.typechecker.Environment env, org.overture.ast.typechecker.NameScope scope) {
    org.overture.typechecker.FlatEnvironment flat = ((org.overture.typechecker.FlatEnvironment) (env));
    flat.add(org.overture.ast.factory.AstFactoryTC.newALocalDefinition(var.name.getLocation(), var.name, scope, var.type));
}