@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    if ((arg0.getSource()) != (btnCreate))
        return ;
    
    try {
        location.addReview(new smartcity.accessibility.socialnetwork.Review(location, slider.getValue(), textArea.getText(), smartcity.accessibility.gui.Application.appUser));
    } catch (org.parse4j.ParseException e) {
        e.printStackTrace();
    }
    frame.dispose();
}