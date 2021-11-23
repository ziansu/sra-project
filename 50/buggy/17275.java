@java.lang.Override
public void run() {
    net.sourceforge.ganttproject.chart.ChartSelection selection = myViewmanager.getSelectedArtefacts();
    myViewmanager.getActiveChart().paste(selection);
    selection.commitClipboardTransaction();
}