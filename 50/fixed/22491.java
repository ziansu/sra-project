public java.util.Collection<ro.sci.group2.domain.Meeting> searchByTeacher(java.lang.Long id) {
    java.util.Collection<ro.sci.group2.domain.Meeting> result = dao.searchByTeacher(id);
    if (result == null) {
        result = new java.util.LinkedList<>();
    }
    return result;
}