@java.lang.Override
public int getItemViewType(int position) {
    if ((position + 1) == (getItemCount())) {
        return com.ray.rssmovie.adapter.EasyListingAdapter.TYPE_ITEM_FOOTER;
    }else {
        return com.ray.rssmovie.adapter.EasyListingAdapter.TYPE_ITEM_NORMAL;
    }
}