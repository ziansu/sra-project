public Abstract.ClassField resolveClassFieldByView(com.jetbrains.jetpad.vclang.term.Abstract.ClassView classView, java.lang.String name) {
    if (name.equals(classView.getClassifyingFieldName())) {
        return classView.getClassifyingField();
    }
    for (com.jetbrains.jetpad.vclang.term.Abstract.ClassViewField viewField : classView.getFields()) {
        if (name.equals(viewField.getName())) {
            return viewField.getUnderlyingField();
        }
    }
    return null;
}