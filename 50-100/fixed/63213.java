@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    boa.gui.GUI.logger.debug("opening object mask for object {} of structure: {}", idx, parent.idx);
    boa.gui.imageInteraction.ImageObjectInterface i = boa.gui.imageInteraction.ImageWindowManagerFactory.getImageManager().getImageObjectInterface(data, data.getStructureIdx());
    boa.gui.imageInteraction.ImageWindowManagerFactory.getImageManager().addImage(i.generateImage(), i, true, true);
}