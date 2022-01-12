@android.support.annotation.Nullable
public static android.content.Context getContextFromFirstParameter(java.lang.Object[] args) {
    if (((args.length) != 0) && (((args[0]) instanceof android.content.Context) || ((args[0]) == null))) {
        return ((android.content.Context) (args[0]));
    }else {
        throw new java.lang.RuntimeException("First parameter must be context.");
    }
}