public void actionPerformed(java.awt.event.ActionEvent e) {
    java.util.Date dt = new java.util.Date();
    java.util.Calendar cal = java.util.GregorianCalendar.getInstance();
    cal.setTime(dt);
    int hours = cal.get(java.util.Calendar.HOUR);
    model.PredictionTime time = (hours <= 12) ? model.PredictionTime.AFTERNOON : model.PredictionTime.MORNING;
    new view.PopUpView(view, model, time).setVisible(true);
}