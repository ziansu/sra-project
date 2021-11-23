public javax.swing.JPanel messagePanel() {
    messagePanel = new javax.swing.JPanel();
    timeLabel = new javax.swing.JLabel((("游戏时间:" + 0) + "秒"));
    showTime();
    javax.swing.JLabel resultLabel = new javax.swing.JLabel("   状态:游戏进行中");
    minesCountLabel = new javax.swing.JLabel(("   剩余地雷个数:" + (minesCount)));
    messagePanel.add(timeLabel);
    messagePanel.add(resultLabel);
    messagePanel.add(minesCountLabel);
    return messagePanel;
}