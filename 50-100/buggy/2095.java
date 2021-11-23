public void setItemClick(final android.view.View view, final int potsition, final com.codbking.calendar.CalendarBean bean) {
    view.setOnClickListener(new com.codbking.calendar.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if ((mSelectedPosition) != (-1)) {
                getChildAt(mSelectedPosition).setSelected(false);
                getChildAt(potsition).setSelected(true);
            }
            mSelectedPosition = potsition;
            if ((onItemClickListener) != null) {
                onItemClickListener.onItemClick(view, potsition, bean);
            }
        }
    });
}