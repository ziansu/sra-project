@java.lang.Override
protected CloneableEditorSupport.Pane createPane() {
    com.eas.designer.application.module.PlatypusModuleSourceDescription sourceDesc = new com.eas.designer.application.module.PlatypusModuleSourceDescription(dataObject);
    com.eas.designer.application.module.PlatypusModuleDatamodelDescription modelDesc = new com.eas.designer.application.module.PlatypusModuleDatamodelDescription(dataObject);
    org.netbeans.core.spi.multiview.MultiViewDescription[] descs = new org.netbeans.core.spi.multiview.MultiViewDescription[]{ sourceDesc , modelDesc };
    org.openide.windows.CloneableTopComponent mv = org.netbeans.core.spi.multiview.MultiViewFactory.createCloneableMultiView(descs, modelDesc, new com.eas.designer.application.module.PlatypusModuleSupport.CloseHandler(dataObject));
    org.openide.text.CloneableEditorSupport.Pane pane = ((org.openide.text.CloneableEditorSupport.Pane) (mv));
    return pane;
}