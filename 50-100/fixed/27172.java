@java.lang.Override
public java.lang.String render() {
    return wrapWithSignParAndExponent((((((this.nthRoot) == 2 ? "" : com.github.nateowami.solve4x.solver.Util.toSubscript(java.lang.Integer.toString(this.nthRoot))) + "√(") + (expr.render())) + ")"), true);
}