@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String newAction = actionField.getText().trim();
    if (!(newAction.isEmpty())) {
        datasetBox.add(new view.component.dataview.DatasetView(newAction, datasetManager), 0);
        layoutDatasetPanel();
    }
}