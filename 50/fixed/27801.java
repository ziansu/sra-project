@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (gui.LessonOverview.createNewLesson())
        gui.LessonOverview.super.dispose();
    
}