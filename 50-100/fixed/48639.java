public void mouseClicked(java.awt.event.MouseEvent evt) {
    javax.swing.JList list = ((javax.swing.JList) (evt.getSource()));
    if ((evt.getClickCount()) == 2) {
        res = ((opdracht1d.Models.Reservering) (list.getSelectedValue()));
        try {
            InitUI(res);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}