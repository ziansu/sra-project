private org.freelo.model.projects.Project buildProjectFromProjectItem(org.freelo.view.ProjectManagement.ProjectItem pi) {
    org.freelo.model.projects.Project pr = new org.freelo.model.projects.Project();
    pi.sprintButton.addClickListener(new org.freelo.controller.projects.SprintCreationListener(pr));
    org.freelo.model.users.User theOneThatCreates = org.freelo.model.users.UserManagement.getUser(pi.manager);
    pr.setName(pi.name);
    pr.setManager(theOneThatCreates.getId());
    pr.addUser(theOneThatCreates);
    return pr;
}