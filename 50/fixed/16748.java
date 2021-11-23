public void setAdapter(java.lang.Class adapterClass, com.hxgraph.HXGraphCollection.INoGraphAdapterListener listener) {
    com.hxgraph.adapter.GraphAdapterImp imp = com.hxgraph.HXGraphCollection.getInstance().getAdapterByName(adapterClass, listener);
    if (imp != null) {
        setAdapter(imp);
    }
}