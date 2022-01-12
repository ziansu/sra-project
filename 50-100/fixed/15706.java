@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    if ((getArguments()) != null) {
        initialPosition = getArguments().getInt(Constants.ARG_POSITION, 0);
        allStoriesList = getArguments().getBoolean(Constants.ARG_ALL_STORIES, true);
    }
    currentPosition = initialPosition;
}