@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if (labelDay[a].getText().equals("")) {
        if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON3)) {
            Calendar.NewWindow nw = new Calendar.NewWindow(year, month, java.lang.Integer.parseInt(labelDay[a].getText()));
        }else
            if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON1)) {
            }
        
    }
}