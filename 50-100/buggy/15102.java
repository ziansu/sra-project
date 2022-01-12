@java.lang.Override
public void mouseClicked(final java.awt.event.MouseEvent evt) {
    if (evt.getSource().equals(lstSolutions)) {
        if ((evt.getClickCount()) == 2) {
            final int index = lstSolutions.locationToIndex(evt.getPoint());
            final nyc.angus.wordgrid.solver.solution.GridSolution solution = lstSolutions.getModel().getElementAt(index);
            final nyc.angus.wordgrid.ui.solution.SolutionFrame solutionDisplay = new nyc.angus.wordgrid.ui.solution.SolutionFrame(solution);
            solutionDisplay.setVisible(true);
        }
    }
}