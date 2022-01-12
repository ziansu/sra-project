public void actionPerformed(java.awt.event.ActionEvent e) {
    if (startButton.getText().toLowerCase().contains("start")) {
        game.Start();
        startButton.setText("Stop");
    }else {
        game.Stop();
        startButton.setText("Start!");
    }
}