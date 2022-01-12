@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    if (boa.gui.GUI.logger.isDebugEnabled())
        boa.gui.GUI.logger.debug("opening input image for structure: {} of idx: {}", ae.getActionCommand(), getStructureIdx(ae.getActionCommand(), openRaw));
    
    boa.gui.imageInteraction.ImageObjectInterface i = boa.gui.imageInteraction.ImageWindowManagerFactory.getImageManager().getImageObjectInterface(data, data.getStructureIdx());
    boa.gui.imageInteraction.ImageWindowManagerFactory.getImageManager().addImage(i.generateRawImage(getStructureIdx(ae.getActionCommand(), openRaw)), i, true);
}