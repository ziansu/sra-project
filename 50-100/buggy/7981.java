@java.lang.Override
public void removeRange(int fromPosition, int itemCount) {
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeRemoved(fromPosition, itemCount);
    for (int i = 0; i < itemCount; i++)
        if (fromPosition < (contentList.size()))
            contentList.remove(fromPosition);
        
    
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeChanged(0, getItemCount());
}