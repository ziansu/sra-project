@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder holder, java.lang.Object item) {
    switch (holder.getItemViewType()) {
        case com.chad.library.adapter.base.BaseSectionQuickAdapter.SECTION_HEADER_VIEW :
            setFullSpan(holder);
            convertHead(holder, ((T) (item)));
            break;
        default :
            convert(holder, ((T) (item)));
            break;
    }
}