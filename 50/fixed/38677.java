@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    org.ESLM.View.teacher.NewExerciseWindow dialog = new org.ESLM.View.teacher.NewExerciseWindow();
    org.ESLM.Model.Instruction newInstruction = dialog.showInputDialog();
    if (newInstruction != null)
        this.protoLesson.addExercise(newInstruction);
    
}