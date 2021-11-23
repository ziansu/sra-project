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
        if ((finishFunction) != null) {
            finishFunction.call(context, scope, scope, null);
        }
    } finally {
        org.mozilla.javascript.Context.exit();
    }
}