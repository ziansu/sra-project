public static com.sdsmdg.bookshareapp.BSA.ui.fragments.TutorialFragment newInstance(java.lang.String title, java.lang.String description, int logoId) {
    com.sdsmdg.bookshareapp.BSA.ui.fragments.TutorialFragment fragment = new com.sdsmdg.bookshareapp.BSA.ui.fragments.TutorialFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.sdsmdg.bookshareapp.BSA.ui.fragments.TutorialFragment.TITLE, title);
    args.putString(com.sdsmdg.bookshareapp.BSA.ui.fragments.TutorialFragment.DESCRIPTION, description);
    args.putInt(com.sdsmdg.bookshareapp.BSA.ui.fragments.TutorialFragment.LOGO_ID, logoId);
    fragment.setArguments(args);
    return fragment;
}