private void showLeaderBoard() {
    contentPane.remove(0);
    contentPane.remove(0);
    javax.swing.JPanel leaderBoardPanel = new javax.swing.JPanel();
    javax.swing.JButton reset_leader = new javax.swing.JButton("Reset Board");
    javax.swing.JButton quit_leader = new javax.swing.JButton("Exit");
    quit_leader.addActionListener(this);
    leaderBoardPanel.add(quit_leader);
    leaderBoardPanel.add(reset_leader);
    reset_leader.addActionListener(this);
    contentPane.add(leaderBoardPanel);
    contentPane.revalidate();
    contentPane.repaint();
}