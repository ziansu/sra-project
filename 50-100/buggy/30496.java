@java.lang.Override
public void okPressed() {
    java.lang.String selected = m_classCombo.getSelectedItem().toString();
    selected = selected.substring(((selected.indexOf(')')) + 1), selected.length()).trim();
    ((weka.knowledgeflow.steps.ClassAssigner) (getStepToEdit())).setClassColumn(selected);
}