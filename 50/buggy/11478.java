@java.lang.Override
public java.lang.String[] getASMTransformerClass() {
    codechicken.core.launch.CodeChickenCorePlugin.versionCheck(CodeChickenCorePlugin.mcVersion, "ExtendedMetadata");
    return new java.lang.String[]{ "org.agecraft.extendedmetadata.asm.EMTransformer" };
}