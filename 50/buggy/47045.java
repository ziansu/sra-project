@java.lang.Override
public boolean apply(java.lang.String input) {
    android.util.Log.d("SnappyRepo", ("Filtering " + input));
    return (input.split(":").length) == 2;
}