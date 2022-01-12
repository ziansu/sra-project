@java.lang.Override
public void start(com.suiton2d.scene.GameObject gameObject) {
    org.mozilla.javascript.Context context = org.mozilla.javascript.Context.enter();
    context.setOptimizationLevel((-1));
    try {
        if ((startFunction) != null) {
            startFunction.call(context, scope, scope, new java.lang.Object[]{ gameObject });
        }
    } finally {
        org.mozilla.javascript.Context.exit();
    }
}