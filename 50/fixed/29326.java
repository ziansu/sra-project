@java.lang.Override
public int getSpanSize(int position) {
    switch (categoryAdapter.getItemViewType(position)) {
        case Category.TYPE_SUB_ITEM :
            return 3;
        case Category.TYPE_SUB_TITLE :
            return 1;
        default :
            return 1;
    }
}