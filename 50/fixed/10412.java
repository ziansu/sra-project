@java.lang.Override
public void remove(int position) {
    contentList.remove(position);
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRemoved(position);
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeChanged(0, getItemCount());
}