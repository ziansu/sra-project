private int getViewForTool(org.droidplanner.android.fragments.EditorToolsFragment.EditorTools tool) {
    switch (tool) {
        case MARKER :
            return R.id.editor_tools_marker;
        case DRAW :
            return R.id.editor_tools_draw;
        case POLY :
            return R.id.editor_tools_poly;
        case TRASH :
            return R.id.editor_tools_trash;
        case SELECTOR :
            return R.id.editor_tools_selector;
        case NONE :
        default :
            return -1;
    }
}