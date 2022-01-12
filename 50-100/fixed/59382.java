@java.lang.Override
public void endCollision(com.suiton2d.scene.GameObject go1, com.suiton2d.scene.GameObject go2) {
    org.mozilla.javascript.Context context = org.mozilla.javascript.Context.enter();
    context.setOptimizationLevel((-1));
    try {
        if ((endCollisionFunction) != null) {
            endCollisionFunction.call(context, scope, scope, new java.lang.Object[]{ go1 , go2 });
        }
    } finally {
        org.mozilla.javascript.Context.exit();
    }
}