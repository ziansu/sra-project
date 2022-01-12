private void addSectionActions(org.eclipse.ui.forms.widgets.Section section) {
    org.eclipse.jface.action.Action expand = org.openlca.app.util.Actions.create(M.ExpandAll, Icon.EXPAND.descriptor(), viewer::expandAll);
    org.eclipse.jface.action.Action collapse = org.openlca.app.util.Actions.create(M.CollapseAll, Icon.COLLAPSE.descriptor(), viewer::collapseAll);
    org.openlca.app.util.Actions.bind(section, expand, collapse);
}