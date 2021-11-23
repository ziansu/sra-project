@java.lang.Override
public void run() {
    net.sourceforge.ganttproject.chart.ChartSelection selection = myViewmanager.getSelectedArtefacts();
    if (selection.isEmpty()) {
        return ;
    }
    myViewmanager.getActiveChart().paste(selection);
    selection.commitClipboardTransaction();
}