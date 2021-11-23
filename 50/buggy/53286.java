public dyvil.tools.compiler.ast.expression.access.ClassConstructor toClassConstructor() {
    dyvil.tools.compiler.ast.expression.access.ClassConstructor cc = new dyvil.tools.compiler.ast.expression.access.ClassConstructor(this.position);
    cc.type = this.type;
    cc.constructor = this.constructor;
    cc.arguments = this.arguments;
    return cc;
}