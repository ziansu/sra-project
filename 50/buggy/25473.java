@java.lang.Override
public extension.Struct setup(extension.Struct struct, runtime.Dictionary dic, runtime.TypeTable typeTable) {
    return extension.ExtensionStructHelper.buildStructFromClass(extension.reflection.StructType.StructTypeProxy.class, dic, typeTable, struct, false);
}