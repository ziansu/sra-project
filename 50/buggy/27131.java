public static com.hitec16.hiteshdemo.fragment.ListOfNews getInstance(java.lang.String tag) {
    com.hitec16.hiteshdemo.fragment.ListOfNews fragment = new com.hitec16.hiteshdemo.fragment.ListOfNews();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.hitec16.hiteshdemo.fragment.ListOfNews.TAG, tag);
    fragment.setArguments(args);
    return fragment;
}