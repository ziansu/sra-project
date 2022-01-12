@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (On()) {
        for (int i = 0; i < (eventTypes.size()); i++) {
            if ((e.getSource()) == (eventTypes.get(i))) {
                eventType = eventTypes.get(i).getText();
            }
        }
    }
}