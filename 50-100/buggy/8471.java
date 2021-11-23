@java.lang.Override
void tableRowClicked(int row, int col) {
    o_removeLabel.setEnabled((row != (-1)));
    o_dismissLabel.setEnabled(((row != (-1)) && (o_item.getReminder(row).isActive())));
    o_linkReminderLabel.setEnabled(((row != (-1)) && (o_item.getReminder(row).isActive())));
}