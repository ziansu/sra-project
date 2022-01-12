public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if (nameList.isSelectionEmpty()) {
        return ;
    }
    java.lang.String movieName = nameList.getSelectedValue();
    dbtLab3.ArrayList<java.lang.String> res = db.getPerformanceDates(movieName);
    nameListModel.removeAllElements();
    for (int i = 0; i < (res.size()); ++i) {
        nameList.add(res.get(i));
    }
}