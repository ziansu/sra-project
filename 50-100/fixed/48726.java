@java.lang.Override
public void update(com.suiton2d.scene.GameObject gameObject, float dt) {
    org.mozilla.javascript.Context context = org.mozilla.javascript.Context.enter();
    context.setOptimizationLevel((-1));
    try {
        if ((updateFunction) != null) {
            updateFunction.call(context, scope, scope, new java.lang.Object[]{ gameObject , dt });
        }
    } finally {
        org.mozilla.javascript.Context.exit();
    }
}