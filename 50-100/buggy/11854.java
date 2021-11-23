@java.lang.Override
public void onBindViewHolder(group.g203.countables.path.detail.view.DateViewHolder holder, int position) {
    setPresenter(holder);
    holder.ivRemove.setTag(position);
    mPresenter.setDateFormat(holder.tvDate, mDates.get(position));
    mPresenter.handleDateColor(holder.tvDate);
    mPresenter.setRemoveClick(holder.ivRemove);
}