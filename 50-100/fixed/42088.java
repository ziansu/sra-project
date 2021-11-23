@com.oracle.truffle.api.nodes.ExplodeLoop
private org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult executeMainRules(final java.lang.Object[] arguments) {
    com.oracle.truffle.api.CompilerAsserts.compilationConstant(rules.length);
    for (int i = 0; i < (rules.length); i++) {
        try {
            final org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule r = rules[i];
            return r.execute(com.oracle.truffle.api.Truffle.getRuntime().createVirtualFrame(arguments, r.getFrameDescriptor()));
        } catch (org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.PatternMatchFailure pmfx) {
        }
    }
    throw org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.PatternMatchFailure.INSTANCE;
}