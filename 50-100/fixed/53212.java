@java.lang.Override
public void visit(com.flarestar.drones.mvw.view.ViewNode node) {
    for (com.flarestar.drones.mvw.view.Directive directive : node.directives) {
        if ((!(directive.isIsolateDirective())) || (directiveClassesFound.contains(directive.getClass()))) {
            continue;
        }
        result.put(directive, isolateDirectiveProcessor.getDirectiveTree(context, directive.getClass()));
        directiveClassesFound.add(directive.getClass());
    }
}