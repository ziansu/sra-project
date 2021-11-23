private nu.xom.Element getTaskElement(java.lang.String id) {
    nu.xom.Element el = ((nu.xom.Element) (elements.get(id)));
    if (el == null) {
        net.sf.memoranda.util.Util.debug(((("Task " + id) + " cannot be found in project ") + (_project.getTitle())));
    }
    return el;
}