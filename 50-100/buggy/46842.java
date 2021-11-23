@java.lang.Override
protected CloneableEditorSupport.Pane createPane() {
    com.eas.designer.application.module.PlatypusModuleSourceDescription sourceDesc = new com.eas.designer.application.module.PlatypusModuleSourceDescription(dataObject);
    com.eas.designer.application.module.PlatypusModuleDatamodelDescription modelDesc = new com.eas.designer.application.module.PlatypusModuleDatamodelDescription(dataObject);
    com.eas.designer.application.report.PlatypusReportLayoutDescription layoutDesc = new com.eas.designer.application.report.PlatypusReportLayoutDescription(((com.eas.designer.application.report.PlatypusReportDataObject) (dataObject)));
    org.netbeans.core.spi.multiview.MultiViewDescription[] descs = new org.netbeans.core.spi.multiview.MultiViewDescription[]{ sourceDesc , layoutDesc , modelDesc };
    org.openide.windows.CloneableTopComponent mv = org.netbeans.core.spi.multiview.MultiViewFactory.createCloneableMultiView(descs, layoutDesc, new com.eas.designer.application.report.CloseHandler(dataObject));
    return ((org.openide.text.CloneableEditorSupport.Pane) (mv));
}