public void setList(java.util.List<com.example.stled.flowfinder2.model.search.RiverModel> riverModelList) {
    if (riverModelList != null) {
        riverModels = riverModelList;
        riverModelFilter = riverModels;
        notifyDataSetChanged();
    }
}