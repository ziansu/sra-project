public void initComponents() {
    taskButton = ((android.widget.Button) (view.findViewById(R.id.taskButton)));
    taskButton.setOnClickListener(myOnlyhandler);
    kursDetaljer = ((android.widget.TextView) (view.findViewById(R.id.kursDetaljer)));
    layoutWithinScrollViewOfTasks = ((se.chalmers.datx02_15_36.studeraeffektivt.view.FlowLayout) (view.findViewById(R.id.layoutWithinScrollViewOfTasks)));
}