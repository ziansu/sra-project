@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    model.Lesson lesson = model.load(((int) (view.getSpinDate().getValue())));
    view.getTaContent().setText((((lesson.getTitle()) + "\n") + (lesson.getContent())));
    java.util.logging.Logger.getLogger("Spinner").info(lesson.toString());
}