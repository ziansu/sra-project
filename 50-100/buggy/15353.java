@java.lang.Override
public void finish() {
    startFunction = null;
    updateFunction = null;
    finishFunction = null;
    beginCollisionFunction = null;
    endCollisionFunction = null;
    org.mozilla.javascript.Context context = org.mozilla.javascript.Context.enter();
    context.setOptimizationLevel((-1));
    try {
        if ((finishFunction) != (org.mozilla.javascript.Scriptable.NOT_FOUND)) {
            finishFunction.call(context, scope, scope, null);
        }
    } finally {
        org.mozilla.javascript.Context.exit();
    }
}