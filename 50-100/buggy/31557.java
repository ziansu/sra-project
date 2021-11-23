private void removeCallback() {
    java.lang.String selected = ((java.lang.String) (list1.getSelectedValue()));
    defaultListModel.removeElement(selected);
    list1.setListData(defaultListModel.toArray());
    timeTable.removeCourse(java.lang.Integer.parseInt(selected));
}