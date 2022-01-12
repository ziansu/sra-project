public void setComponentView(java.lang.String stream) {
    java.awt.Container c = this.getContentPane();
    c.removeAll();
    c.revalidate();
    c.repaint();
    switch (stream) {
        case br.edu.ifsp.application.NewCamera.COLOR_STREAM :
            view.setCamera(ShowObject.COLOR);
            break;
        case br.edu.ifsp.application.NewCamera.DEPTH_STREAM :
            view.setCamera(ShowObject.DEPTH);
            break;
    }
    c.add(view);
    c.repaint();
}