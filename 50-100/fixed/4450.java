public void generateDiagram() {
    model = new infovis.scatterplot.Model();
    infovis.piechart.PieChart.view = new infovis.piechart.View();
    mouse_controller = new infovis.piechart.MouseController();
    key_controller = new infovis.piechart.KeyboardController();
    infovis.piechart.PieChart.view.addMouseListener(mouse_controller);
    infovis.piechart.PieChart.view.addMouseMotionListener(mouse_controller);
    infovis.piechart.PieChart.view.addKeyListener(key_controller);
    infovis.piechart.PieChart.view.setFocusable(true);
    mouse_controller.setModel(model);
    mouse_controller.setView(infovis.piechart.PieChart.view);
    key_controller.setView(infovis.piechart.PieChart.view);
}