public java.util.List<com.teamagam.gimelgimel.app.model.ViewsModels.DrawerListItem> getDrawerListItems() {
    java.util.List<com.teamagam.gimelgimel.app.model.ViewsModels.DrawerListItem> list = new java.util.ArrayList<>();
    list.add(new com.teamagam.gimelgimel.app.model.ViewsModels.DrawerListItem("Home", getDrawable(R.drawable.ic_info_black_24dp), R.id.container_footer, new android.app.Fragment()));
    list.add(new com.teamagam.gimelgimel.app.model.ViewsModels.DrawerListItem("Vector Manipulation", getDrawable(R.drawable.ic_info_black_24dp), R.id.container_footer, new com.teamagam.gimelgimel.app.view.fragments.viewer_footer_fragments.VectorManipulationFooterFragment()));
    list.add(new com.teamagam.gimelgimel.app.model.ViewsModels.DrawerListItem("Map Manipulation", getDrawable(R.drawable.ic_info_black_24dp), R.id.container_footer, new com.teamagam.gimelgimel.app.view.fragments.viewer_footer_fragments.MapManipulationFooterFragment()));
    return list;
}