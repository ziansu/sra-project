private static void assertTypeCheckFails(wyvern.tools.typedAST.interfaces.ExpressionAST ast, wyvern.target.corewyvernIL.support.GenContext genCtx) {
    try {
        wyvern.target.corewyvernIL.expression.Expression program = ast.generateIL(genCtx, null);
        program.typeCheck(wyvern.target.corewyvernIL.support.TypeContext.empty().extend("system", wyvern.target.corewyvernIL.support.Util.unitType()));
        org.junit.Assert.fail("A type error should have been reported.");
    } catch (wyvern.tools.errors.ToolError toolError) {
    }
}