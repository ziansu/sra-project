public static void ReInit(lsf.zuba.javacc.SimpleCharStream stream, int lexState) {
    lsf.zuba.javacc.SyntaxCheckerTokenManager.ReInit(stream);
    lsf.zuba.javacc.SyntaxCheckerTokenManager.SwitchTo(lexState);
}