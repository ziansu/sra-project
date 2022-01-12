public void setTopicState(int topic, org.zalgosircular.extempfiller2.ui.gui.panels.TopicManagerPanel.TopicState state) {
    final javax.swing.DefaultListModel<org.zalgosircular.extempfiller2.ui.gui.panels.TopicManagerPanel.TopicListItem> model = ((javax.swing.DefaultListModel<org.zalgosircular.extempfiller2.ui.gui.panels.TopicManagerPanel.TopicListItem>) (list.getModel()));
    if (topic < (model.size())) {
        if (state == (org.zalgosircular.extempfiller2.ui.gui.panels.TopicManagerPanel.TopicState.DELETED)) {
            model.remove(topic);
        }else {
            model.get(topic).setState(state);
        }
    }
    list.repaint();
}