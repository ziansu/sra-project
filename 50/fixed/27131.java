public static com.hitec16.hiteshdemo.fragment.ListOfNews getInstance(@android.support.annotation.NonNull
java.lang.String param) {
    com.hitec16.hiteshdemo.fragment.ListOfNews fragment = new com.hitec16.hiteshdemo.fragment.ListOfNews();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.hitec16.hiteshdemo.fragment.ListOfNews.TAG, param);
    fragment.setArguments(args);
    return fragment;
}