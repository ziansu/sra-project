private org.netbeans.modules.php.api.executable.PhpExecutable createPhpExecutable(org.netbeans.modules.php.api.phpmodule.PhpModule phpModule) {
    org.netbeans.modules.php.cake3.modules.CakePHP3Module module = org.netbeans.modules.php.cake3.modules.CakePHP3Module.forPhpModule(phpModule);
    java.util.List<org.openide.filesystems.FileObject> directories = module.getDirectories(Base.APP);
    org.netbeans.modules.php.api.executable.PhpExecutable phpExecutable = new org.netbeans.modules.php.api.executable.PhpExecutable(cakePath).viaPhpInterpreter(false).viaAutodetection(false);
    if (!(directories.isEmpty())) {
        java.io.File workDir = org.openide.filesystems.FileUtil.toFile(directories.get(0));
        phpExecutable = phpExecutable.workDir(workDir);
    }
    return phpExecutable;
}