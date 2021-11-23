@java.lang.Override
public void onBindViewHolder(com.lufficc.lightadapter.LoadMoreFooterModel footerModel, com.lufficc.lightadapter.LoadMoreFooterViewHolderProvider.FooterViewHolder viewHolder, int position) {
    if ((footerModel.getInitState()) != (FooterState.STATE_INVALID)) {
        viewHolder.state = footerModel.getInitState();
        footerModel.setInitState(FooterState.STATE_INVALID);
    }
    footerModel.setFooterViewHolder(viewHolder);
    viewHolder.onBind(footerModel);
}