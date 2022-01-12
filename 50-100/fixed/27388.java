protected void endSection(gov.nasa.jpl.mbee.mdk.viewedit.DBSection section) {
    addManualInstances(true);
    processUnusedInstances(currentView.peek());
    newpe.pop();
    currentSection.pop();
    currentManualInstances.pop();
    currentImageInstances.pop();
    currentSectionInstances.pop();
    currentParaInstances.pop();
    currentListInstances.pop();
    currentTableInstances.pop();
    currentInstanceList.pop();
    currentUnusedInstances.pop();
}