public static com.pquach.vocabularynote.WordFragment newInstance(long category) {
    com.pquach.vocabularynote.WordFragment fragment = new com.pquach.vocabularynote.WordFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putLong(Constant.ARG_CATEGORY, category);
    fragment.setArguments(args);
    return fragment;
}