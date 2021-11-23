@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    streamupdater.gui.components.ThumbnailEditor.layers[pos].reset();
    layer[pos].setToolTipText("");
    streamupdater.gui.components.ThumbnailEditor.te[pos].getFrame().dispose();
}