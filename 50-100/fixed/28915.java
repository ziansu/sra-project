public void openFile(java.io.File file) {
    me.ferrybig.javacoding.graphical.decompiler.CodeOverview codeOverview = new me.ferrybig.javacoding.graphical.decompiler.CodeOverview(file.getName(), file.getAbsolutePath(), config);
    me.ferrybig.javacoding.graphical.decompiler.Decompiler decompiler = new me.ferrybig.javacoding.graphical.decompiler.Decompiler(file, codeOverview, config);
    codeOverview.registerDecompiler(decompiler);
    addTab(file.getAbsolutePath(), file.getName(), codeOverview, decompiler::stop);
    decompiler.start();
}