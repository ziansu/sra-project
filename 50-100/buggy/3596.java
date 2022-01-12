public static java.lang.String link(com.erudika.para.core.ParaObject obj, java.lang.String id2) {
    com.erudika.para.core.ParaObject second = obj.getDao().read(id2);
    if ((second == null) || ((obj.getId()) == null)) {
        return null;
    }
    return obj.getDao().create(obj.getAppid(), new com.erudika.para.core.Linker(obj.getType(), second.getType(), obj.getId(), id2));
}