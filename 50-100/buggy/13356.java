private org.droidplanner.android.fragments.EditorToolsFragment.EditorTools getToolForView(int viewId) {
    switch (viewId) {
        case R.id.editor_tools_marker :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.MARKER;
        case R.id.editor_tools_draw :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.DRAW;
        case R.id.editor_tools_poly :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.POLY;
        case R.id.editor_tools_trash :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.TRASH;
        case R.id.editor_tools_selector :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.SELECTOR;
        case R.id.editor_tools_info :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.DETAIL_WINDOW;
        default :
            return org.droidplanner.android.fragments.EditorToolsFragment.EditorTools.NONE;
    }
}