@java.lang.Override
public void insertRange(int position, java.util.Collection<M> dataSet) {
    contentList.addAll(position, dataSet);
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeInserted(position, dataSet.size());
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeChanged(position, getItemCount());
}