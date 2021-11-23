public static net.sf.memoranda.Project createProject(java.lang.String id, java.lang.String title, net.sf.memoranda.date.CalendarDate startDate, net.sf.memoranda.date.CalendarDate endDate) {
    nu.xom.Element el = new nu.xom.Element("project");
    el.addAttribute(new nu.xom.Attribute("id", id));
    net.sf.memoranda.ProjectManager._root.appendChild(el);
    net.sf.memoranda.Project prj = new net.sf.memoranda.ProjectImpl(el);
    prj.setTitle(title);
    prj.setStartDate(startDate);
    prj.setEndDate(endDate);
    net.sf.memoranda.util.CurrentStorage.get().createProjectStorage(prj);
    net.sf.memoranda.CurrentProject.set(prj);
    return prj;
}