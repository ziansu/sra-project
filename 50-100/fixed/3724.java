public static ai.h2o.cascade.Val eval(java.lang.String cascade, ai.h2o.cascade.CascadeSession session) {
    if (water.util.StringUtils.isNullOrEmpty(cascade))
        return new ai.h2o.cascade.ValNull();
    
    ai.h2o.cascade.asts.AstNode ast = ai.h2o.cascade.Cascade.parse(cascade);
    ai.h2o.cascade.Val result = ast.exec(session.globalScope());
    session.cleanCorporealFrameRegistry();
    ai.h2o.cascade.stdlib.core.FnLet let = new ai.h2o.cascade.stdlib.core.FnLet(session.globalScope());
    let.apply("_", result);
    return result;
}