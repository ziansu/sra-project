@java.lang.Override
protected void updateComponent() {
    org.knime.knip.io.nodes.annotation.edit.SettingsModelLabelEditor model = ((org.knime.knip.io.nodes.annotation.edit.SettingsModelLabelEditor) (getModel()));
    java.util.Map<org.knime.knip.core.ui.imgviewer.annotator.RowColKey, org.knime.knip.io.nodes.annotation.edit.control.LabelingEditorChangeTracker> map = new java.util.HashMap<org.knime.knip.core.ui.imgviewer.annotator.RowColKey, org.knime.knip.io.nodes.annotation.edit.control.LabelingEditorChangeTracker>(model.getTrackerMap());
    m_annotatorView.reset();
    for (org.knime.knip.core.ui.imgviewer.annotator.RowColKey key : map.keySet()) {
        m_annotatorView.setAnnotation(key, map.get(key));
    }
}