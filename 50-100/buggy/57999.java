private void removeDetails(int index) {
    for (int index2 = (visiblePageAndDetailsList.size()) - 1; index2 >= index; index2--) {
        visiblePageAndDetailsList.remove(index2);
        verticalPanel.remove(((verticalPanel.getComponentCount()) - 1));
    }
    verticalPanel.revalidate();
    verticalPanel.repaint();
}