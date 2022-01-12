public elcom.mbeans.Task getSelectedTask() {
    if (((tabs.size()) != 0) && ((tabs.get(activeTabIndex)) instanceof elcom.mbeans.TaskSelector))
        return ((elcom.mbeans.TaskSelector) (tabs.get(activeTabIndex))).getSelectedTask();
    else
        return null;
    
}