@android.annotation.SuppressLint(value = "RtlHardcoded")
@com.actinarium.rhythm.RhythmSpecLayer.Edge
public int getLayerGravity(java.lang.String key, @com.actinarium.rhythm.RhythmSpecLayer.Edge
int defaultValue) {
    java.lang.String gravityArg = mArguments.get(key);
    if ("top".equals(gravityArg)) {
        return android.view.Gravity.TOP;
    }else
        if ("left".equals(gravityArg)) {
            return android.view.Gravity.LEFT;
        }else
            if ("right".equals(gravityArg)) {
                return android.view.Gravity.RIGHT;
            }else
                if ("bottom".equals(gravityArg)) {
                    return android.view.Gravity.BOTTOM;
                }else {
                    return defaultValue;
                }
            
        
    
}