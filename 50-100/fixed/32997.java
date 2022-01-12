@java.lang.Override
public void onClick(android.view.View view) {
    switch (type) {
        case com.temoa.gankio.adapter.RecyclerAdapter.TYPE_ITEM_CLICK :
            if ((mItemClickListener) != null)
                mItemClickListener.onItemClick(view, realData.get(position), position);
            
            break;
        case com.temoa.gankio.adapter.RecyclerAdapter.TYPE_CHILD_CLICK :
            if ((mItemChildClickListener) != null)
                mItemChildClickListener.onItemChildClick(view, realData.get(position), position);
            
    }
}