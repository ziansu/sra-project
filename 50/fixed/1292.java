private void maybeEmitJsDoc(com.google.javascript.rhino.JSDocInfo docs, boolean ignoreParams) {
    if (docs == null) {
        return ;
    }
    java.lang.String desc = docs.getBlockDescription();
    if (desc == null) {
        return ;
    }
    emit("/**");
    emitBreak();
    for (java.lang.String line : com.google.common.base.Splitter.on('\n').split(desc)) {
        emit(" *");
        if (!(line.isEmpty()))
            emit(line);
        
        emitBreak();
    }
    if (!ignoreParams) {
        for (java.lang.String name : docs.getParameterNames()) {
            if ((docs.getDescriptionForParameter(name)) == null)
                continue;
            
            emit(" * @param");
            emit(name);
            emit(docs.getDescriptionForParameter(name));
            emitBreak();
        }
    }
    emit(" */");
    emitBreak();
}