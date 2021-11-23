private boolean match(org.cloudish.borg.model.Task task) {
    if (jidAllocated.contains(task.getJid())) {
        return false;
    }
    for (org.cloudish.borg.model.TaskConstraint constraint : task.getConstraints()) {
        org.cloudish.borg.model.HostAttribute hostAtt = attributes.get(constraint.getAttName());
        if ((hostAtt == null) || (!(hostAtt.match(constraint)))) {
            return false;
        }
    }
    return true;
}