@java.lang.Override
protected void populateViewHolder(com.aparnyuk.rsn.adapter.RemindListAdapter.RemindViewHolder RemindViewHolder, com.aparnyuk.rsn.model.Remind remind, int i) {
    RemindViewHolder.remindText.setText(remind.getText());
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd.MM.yyyy, HH:mm");
    RemindViewHolder.dateText.setText(dateFormat.format(remind.getDate()));
    if (com.aparnyuk.rsn.adapter.RemindListAdapter.deleteItemSet.contains(RemindViewHolder.getLayoutPosition())) {
        RemindViewHolder.ll.setBackgroundColor(Color.LTGRAY);
    }else {
        RemindViewHolder.ll.setBackgroundColor(Color.WHITE);
    }
}