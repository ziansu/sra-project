@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    view.PathFinderController.algorithms = new view.HeuristicAlgorithm[4];
    view.PathFinderController.algorithms[0] = new view.UniformSearch();
    view.PathFinderController.algorithms[1] = new view.AStar(1);
    view.PathFinderController.algorithms[2] = new view.WeightedAStar(1, 1.3);
    view.PathFinderController.algorithms[3] = new view.WeightedAStar(1, 2.6);
    view.PathFinderController.allStats = new view.HeuristicAlgorithm.Stats[view.PathFinderController.MAXGRIDS][view.PathFinderController.MAXTRIALS][3];
    view.PathFinderController.centers = new java.util.ArrayList<java.awt.Point>();
}