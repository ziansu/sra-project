public void actionPerformed(java.awt.event.ActionEvent e) {
    MGP.createMaze(20, 20, new Maze());
    MazeWindow.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    MazeWindow.add(MGP);
    MazeCreatorWindow.add(MCP);
    MazeWindow.setSize(600, 600);
    MazeCreatorWindow.setSize(380, 78);
    MazeWindow.setTitle("Maze Solver : Maze");
    MazeCreatorWindow.setTitle("Maze Solver : Maze Creation Tools");
    MazeWindow.setVisible(true);
    MazeCreatorWindow.setVisible(true);
}