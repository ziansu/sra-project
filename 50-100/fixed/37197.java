private static boolean addOtherFlagToToolOption(org.eclipse.cdt.managedbuilder.core.IConfiguration cf, java.lang.String otherFlag) {
    org.eclipse.cdt.managedbuilder.core.ITool compiler = org.eclipse.cdt.managedbuilder.pkgconfig.util.PathToToolOption.getCompiler(cf);
    if (compiler != null) {
        org.eclipse.cdt.managedbuilder.core.IOption otherFlagOption = org.eclipse.cdt.managedbuilder.pkgconfig.util.PathToToolOption.getCompilerOtherFlagsOption(cf);
        if (otherFlagOption != null) {
            return org.eclipse.cdt.managedbuilder.pkgconfig.util.PathToToolOption.addOtherFlagToToolOption(cf, compiler, otherFlagOption, otherFlag);
        }
        return false;
    }
    return false;
}