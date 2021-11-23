public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println(calGUI.AddView.Date.getCurDate());
    recurringGroup.clearSelection();
    weekly.setVisible(false);
    biweekly.setVisible(false);
    monthly.setVisible(false);
    monthList.setVisible(true);
    dayList.setVisible(true);
    calGUI.AddView.fillBoxes(monthList, dayList);
}