@org.rstudio.core.client.command.Handler
void onExecuteCurrentFunction() {
    docDisplay_.focus();
    docDisplay_.getScopeTree();
    org.rstudio.studio.client.workbench.views.source.editors.text.Scope currentFunction = docDisplay_.getCurrentFunction();
    if ((currentFunction == null) || ((currentFunction.getEnd()) == null))
        return ;
    
    org.rstudio.studio.client.workbench.views.source.editors.text.ace.Position start = currentFunction.getPreamble();
    org.rstudio.studio.client.workbench.views.source.editors.text.ace.Position end = currentFunction.getEnd();
    codeExecution_.executeRange(org.rstudio.studio.client.workbench.views.source.editors.text.ace.Range.fromPoints(start, end));
}