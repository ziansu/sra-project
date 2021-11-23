public void setList(java.util.List<T> list) {
    this.list = list;
    wrapMap.clear();
    if (((this.list) != null) && ((getItemCount()) > 0)) {
        for (T t : this.list) {
            final long index = getIndex(t);
            if (index == (com.ray.mvvm.lib.view.adapter.list.base.ListAdapter.NO_INDEX))
                break;
            
            wrapMap.put(index, t);
        }
    }
    com.ray.mvvm.lib.view.adapter.list.base.ListAdapter.notifyDataSetChanged();
}