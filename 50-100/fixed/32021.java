boolean isPageEmpty() {
    return ((writer) == null) || ((((writer.getDirectContent().size(false)) == 0) && ((writer.getDirectContentUnder().size(false)) == 0)) && ((pageEmpty) || (writer.isPaused())));
}