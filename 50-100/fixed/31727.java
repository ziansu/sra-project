public void setSupertask(boolean isSupertask) {
    if (isSupertask) {
        net.sourceforge.ganttproject.gui.taskproperties.TaskScheduleDatesPanel.ourStartDateLock.setValue(true);
        net.sourceforge.ganttproject.gui.taskproperties.TaskScheduleDatesPanel.ourDurationLock.setValue(true);
        net.sourceforge.ganttproject.gui.taskproperties.TaskScheduleDatesPanel.ourEndDateLock.setValue(true);
        myLockHyperlink.setEnabled(false);
        myLockLabel.setEnabled(false);
    }else {
        net.sourceforge.ganttproject.gui.taskproperties.TaskScheduleDatesPanel.ourDurationLock.setValue(false);
        net.sourceforge.ganttproject.gui.taskproperties.TaskScheduleDatesPanel.ourStartDateLock.setValue(false);
        myLockHyperlink.setEnabled(true);
        net.sourceforge.ganttproject.gui.taskproperties.TaskScheduleDatesPanel.ourPrevLock.setValue(true);
        myLockLabel.setEnabled(true);
    }
}