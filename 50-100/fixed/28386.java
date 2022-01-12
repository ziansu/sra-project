@java.lang.Override
public int compare(model.project.Phase o1, model.project.Phase o2) {
    if (((o1.getStartDate()) == null) || ((o2.getStartDate()) == null))
        return -1;
    
    return o1.getStartDate().isBefore(o2.getStartDate()) ? 1 : o1.getStartDate().isEqual(o2.getStartDate()) ? 0 : -1;
}