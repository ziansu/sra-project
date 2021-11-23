@java.lang.Override
public javax.faces.component.visit.VisitResult visit(javax.faces.component.visit.VisitContext visitContext, javax.faces.component.UIComponent component) {
    javax.faces.component.visit.VisitResult result = javax.faces.component.visit.VisitResult.ACCEPT;
    if (com.sun.faces.application.view.FormOmittedChecker.isForm(component)) {
        result = javax.faces.component.visit.VisitResult.REJECT;
    }else
        if (com.sun.faces.application.view.FormOmittedChecker.isInNeedOfForm(component)) {
            com.sun.faces.application.view.FormOmittedChecker.addFormOmittedMessage(finalContext);
        }
    
    return result;
}