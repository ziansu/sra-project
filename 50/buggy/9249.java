@java.lang.Override
public com.jetbrains.jetpad.vclang.error.doc.LineDoc getHeaderDoc(com.jetbrains.jetpad.vclang.term.SourceInfoProvider src) {
    return com.jetbrains.jetpad.vclang.error.doc.DocFactory.hList(super.getHeaderDoc(src), com.jetbrains.jetpad.vclang.error.doc.DocFactory.text(((" Cannot solve equation " + (variable)) + " <= constant")));
}