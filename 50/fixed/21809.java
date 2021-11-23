@android.support.annotation.NonNull
static me.oriley.bunyan.Bunyan.Level getThreshold(@android.support.annotation.NonNull
java.lang.String className) {
    if (me.oriley.bunyan.Bunyan.sClassThresholds.containsKey(className)) {
        return me.oriley.bunyan.Bunyan.sClassThresholds.get(className);
    }else {
        return me.oriley.bunyan.Bunyan.sGlobalThreshold;
    }
}