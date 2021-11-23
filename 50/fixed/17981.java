@java.lang.Override
public android.content.Context setUpContext(flow.path.Path path, android.content.Context parentContext) {
    mortar.MortarScope screenScope = screenScoper.getScreenScope(parentContext, path.toString(), path);
    return new com.example.mortar.mortarflow.MortarContextFactory.TearDownContext(parentContext, screenScope);
}