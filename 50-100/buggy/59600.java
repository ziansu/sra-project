public static void main(java.lang.String[] args) {
    model.Font.prepare();
    execution.Runner.frame = new javax.swing.JFrame();
    viewModel.MainViewModel mainViewModel = new viewModel.MainViewModel();
    execution.Runner.frame.setSize(900, 400);
    execution.Runner.frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    execution.Runner.frame.setVisible(true);
    execution.Runner.frame.add(mainViewModel);
}