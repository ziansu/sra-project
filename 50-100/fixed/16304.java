public void initComponents() {
    taskButton = ((android.widget.Button) (findViewById(R.id.taskButton)));
    taskButton.setOnClickListener(myOnlyhandler);
    kursDetaljer = ((android.widget.TextView) (findViewById(R.id.kursDetaljer)));
    layoutWithinScrollViewOfTasks = ((se.chalmers.datx02_15_36.studeraeffektivt.view.FlowLayout) (findViewById(R.id.layoutWithinScrollViewOfTasks)));
}