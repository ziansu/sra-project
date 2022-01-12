public void addStudentContentSection(java.lang.String ab) {
    addBefore = ab;
    if (canEditPage()) {
        org.sakaiproject.lessonbuildertool.tool.beans.SimplePageItem item = appendItem("", messageLocator.getMessage("simplepage.student-content"), SimplePageItem.STUDENT_CONTENT);
        item.setDescription(messageLocator.getMessage("simplepage.student-content"));
        update(item);
        itemsCache.remove(getCurrentPage().getPageId());
    }else {
        setErrMessage(messageLocator.getMessage("simplepage.permissions-general"));
    }
}