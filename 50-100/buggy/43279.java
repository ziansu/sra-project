@android.support.annotation.Nullable
public static android.content.Context getContextFromFirstParameter(java.lang.Object[] args) {
    if (((args.length) == 0) || (!(((args[0]) != null) && ((args[0]) instanceof android.content.Context)))) {
        throw new java.lang.RuntimeException("First parameter must be context.");
    }else {
        return ((android.content.Context) (args[0]));
    }
}