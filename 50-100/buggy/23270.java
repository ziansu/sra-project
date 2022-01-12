public void addButton(java.lang.String buttonText, java.lang.String buttonLabel, java.lang.Runnable task) {
    javax.swing.JButton button = new javax.swing.JButton(buttonLabel);
    button.addActionListener(( e) -> {
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(task);
    });
    this.addItem(buttonText, button);
    pack();
}