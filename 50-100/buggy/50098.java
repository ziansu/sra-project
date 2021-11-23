protected void split(java.util.List<T> list, cn.com.deepdata.es_adapter.adapter.AdapterContext ctx) {
    for (T ele : list) {
        try {
            cn.com.deepdata.es_adapter.adapter.DataListSplitter.getDataQueue().put(new cn.com.deepdata.es_adapter.model.DataWrapper(ele, ctx.getNextAdapterClazz()));
        } catch (java.lang.InterruptedException e) {
        }
    }
}