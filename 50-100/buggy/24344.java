public static void main(java.lang.String[] args) {
    try {
        java.lang.String s = "(2/2/X)";
        com.ruh.exprcal.fragments.Constant.addConstant("X", 4.0);
        com.ruh.exprcal.renderer.ExpressionRenderer e = new com.ruh.exprcal.renderer.ExpressionRenderer(s, com.ruh.exprcal.renderer.ExpressionRenderer.DEGREE, 4);
        java.lang.System.out.println(e.getExpression());
        java.lang.System.out.println(e.render().getResult());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}