public void renameField(com.zhangwei.smali.api.SmaliEntry se, com.zhangwei.smali.api.FieldEntry fe, java.lang.String s) {
    java.lang.String className = se.classHeader.classNameSelf;
    java.lang.String oldFieldName = fe.classFieldName;
    java.lang.String newFieldName = s;
    java.util.Iterator<com.zhangwei.smali.api.SmaliEntry> iterator = globeClassSet.iterator();
    while (iterator.hasNext()) {
        com.zhangwei.smali.api.SmaliEntry se_item = iterator.next();
        se_item.renameFieldContent(className, oldFieldName, newFieldName, fe.classFieldType);
    } 
    fe.RenameName(className, oldFieldName, newFieldName, fe.classFieldType);
    se.setFileContent();
}