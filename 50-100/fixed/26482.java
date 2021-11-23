public void initialize() {
    btnShow.setOnAction(( e) -> {
        try {
            java.util.Queue<Athlete> maleQueue = fillQueue("male");
            java.util.Queue<Athlete> femaleQueue = fillQueue("female");
            displayQueue(maleQueue, "male");
            displayQueue(femaleQueue, "female");
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    });
}