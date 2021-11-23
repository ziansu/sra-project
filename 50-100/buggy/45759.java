public void staffCodeChanged(javax.faces.event.ValueChangeEvent e) throws Bus.BusinessExceptions {
    selectedid = ((java.lang.Long) (e.getNewValue()));
    setSelectedid(selectedid);
    if (java.util.Objects.isNull(getSelectedid())) {
        getMilestones().clear();
        setMilestoneselected(false);
        setProjectselected(false);
        setNewmilestoneselected(false);
    }else {
        selectedStaff();
        getMilestones().clear();
        setMilestoneselected(false);
        setProjectselected(false);
        setNewmilestoneselected(false);
    }
}