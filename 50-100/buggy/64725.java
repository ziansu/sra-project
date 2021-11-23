public void actionPerformed(java.awt.event.ActionEvent e) {
    if (startButton.getText().toLowerCase().contains("start")) {
        game.Start(stavePanel, dataPanel);
        startButton.setText("Stop");
    }else {
        game.Stop();
        startButton.setText("Start!");
    }
}