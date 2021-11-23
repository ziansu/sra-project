static void removeEventB_actionPerformed(java.awt.event.ActionEvent e, net.sf.memoranda.Event ev) {
    net.sf.memoranda.EventsManager.removeEvent(ev);
    net.sf.memoranda.ui.EventsPanel.saveEvents();
}