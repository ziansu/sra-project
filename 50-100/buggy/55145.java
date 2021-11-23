@java.lang.Override
public void sectionChanged(int id) {
    for (model.Section s : sections) {
        if ((s.getID()) == id) {
            if (useController) {
                controller.receiveSectionEvent(id);
            }
            java.lang.System.out.println("Section changing");
            s.setTrainOn((!(s.getTrainOn())));
        }
    }
}