public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println(("you pressed: " + (e.getActionCommand())));
    java.util.LinkedList<java.awt.Event> events = user.getEventsByDate(time.getYear(), time.getMonth(), java.lang.Integer.parseInt(e.getActionCommand()));
    PopoutEventShow(events, e.getActionCommand());
}