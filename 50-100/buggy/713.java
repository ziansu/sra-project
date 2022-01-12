public static int getFieldPosition(org.eclipse.cdt.core.dom.ast.cpp.ICPPField field) {
    final org.eclipse.cdt.core.dom.ast.cpp.ICPPClassType ownerType = field.getClassOwner();
    final org.eclipse.cdt.core.dom.ast.cpp.ICPPClassType[] baseClasses = org.eclipse.cdt.internal.core.dom.parser.cpp.ClassTypeHelper.getAllBases(ownerType, null);
    int baseFields = 0;
    for (org.eclipse.cdt.core.dom.ast.cpp.ICPPClassType baseClass : baseClasses) {
        baseFields += org.eclipse.cdt.internal.core.dom.parser.cpp.ClassTypeHelper.getDeclaredFields(baseClass, null).length;
    }
    return baseFields + (field.getFieldPosition());
}