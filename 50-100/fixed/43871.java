private void updateItemSelectableUI(com.yat3s.calendar.data.model.Day day, com.yat3s.calendar.common.widget.BaseViewHolder holder) {
    if (null == holder) {
        return ;
    }
    holder.setVisible(R.id.highlight_day_tv, day.isSelected).setVisible(R.id.event_badge_view, (((!(day.isSelected)) && (!(day.isFirstDayInMonth))) && (day.hasEvent()))).setVisible(R.id.date_layout, (!(day.isSelected)));
}