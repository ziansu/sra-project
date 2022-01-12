private void addInterface(proguard.classfile.ProgramClass programClass, int i) {
    java.lang.String interfaceClazz = programClass.getInterfaceName(i);
    if (visitorDTO.isLibClazz(interfaceClazz)) {
        com.taobao.android.builder.tools.proguard.dump.VisitorDTO.ClassStruct classStruct = getOrCreateClassStruct(programClass);
        classStruct.addInterface(interfaceClazz);
        addSuperInterfaces(interfaceClazz, classStruct);
    }
}