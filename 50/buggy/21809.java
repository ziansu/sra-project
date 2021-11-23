@android.support.annotation.NonNull
static me.oriley.bunyan.Bunyan.Level getThreshold(@android.support.annotation.NonNull
java.lang.Class c) {
    if (me.oriley.bunyan.Bunyan.sClassThresholds.containsKey(c)) {
        return me.oriley.bunyan.Bunyan.sClassThresholds.get(c);
    }else {
        return me.oriley.bunyan.Bunyan.sGlobalThreshold;
    }
}