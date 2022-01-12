@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    folderTitle = this.getArguments().getString(FRAGMENT_ARGS_FOLDER_TITLE);
    setUpToolbar();
}