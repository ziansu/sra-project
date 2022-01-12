public static layout.StreamFragment newInstance(android.content.Context context, java.lang.String value) {
    layout.StreamFragment fragment = new layout.StreamFragment(context);
    android.os.Bundle args = new android.os.Bundle();
    args.putString("key", value);
    fragment.setArguments(args);
    return fragment;
}