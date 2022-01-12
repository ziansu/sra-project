public void run() {
    robotList.add(r);
    if ((ticker) == null) {
        ticker = new javax.swing.Timer((1000 / 30), r);
        ticker.start();
    }else {
        ticker.addActionListener(r);
    }
}