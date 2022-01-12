@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.System.out.println("jdajksdn");
    if (!(src.PhotoViewer.mouseClickedInImageArea)) {
        for (int i = 0; i < (src.PhotoViewer.labels.size()); i++) {
            javax.swing.JButton lbl = ((javax.swing.JButton) (e.getSource()));
            if ((src.PhotoViewer.labels.get(i)) == lbl) {
                java.lang.System.out.println((i + " is clicked"));
                src.PhotoViewer.clickedImage = i;
                src.PhotoViewer.mouseClickedInImageArea = true;
                break;
            }
        }
    }
}