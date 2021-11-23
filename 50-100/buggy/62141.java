private void createControllerSections() {
    for (int i = 0; i < (sections.length); i++) {
        contrlSections[i] = new model.Controller.ControllerSection(sections[i], false, false);
    }
    for (model.Controller.ControllerSection cs : contrlSections) {
        for (model.Controller.ControllerTrain ct : trains) {
            if ((ct.curSection) == (cs.section.getID())) {
                cs.on = true;
                cs.acquireLock();
            }
        }
    }
}