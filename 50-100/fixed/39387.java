@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (guiCon.editSubject(subject, nameT.getText(), shortNameT.getText(), teacherT.getText(), colorL.getBackground())) {
        guiCon.displayPanel(guiCon.getManageSubjects().displaySubjects(de.privat.ciupka.schedule.controller.Controller.getInstance().loadAllSubjects()));
    }
}