@java.lang.Override
public void onClick(android.view.View view) {
    switch (type) {
        case com.temoa.gankio.adapter.RecyclerAdapter.TYPE_ITEM_CLICK :
            mItemClickListener.onItemClick(view, realData.get(position), position);
            break;
        case com.temoa.gankio.adapter.RecyclerAdapter.TYPE_CHILD_CLICK :
            mItemChildClickListener.onItemChildClick(view, realData.get(position), position);
    }
}