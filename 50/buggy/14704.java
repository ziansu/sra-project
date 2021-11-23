public static free.rm.skytube.gui.businessobjects.SubsAdapter get(android.content.Context context, android.view.View progressBar) {
    if ((free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter) == null) {
        free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter = new free.rm.skytube.gui.businessobjects.SubsAdapter(context, progressBar);
    }else {
        free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter.setContext(context);
    }
    return free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter;
}