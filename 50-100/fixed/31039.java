private org.nlamah.QL.ViewControllers.Form.ConditionalBlockViewController addElseThenBlockView(org.nlamah.QL.ViewControllers.Form.ConditionalBlockViewController conditionalBlockViewController) {
    org.nlamah.QL.Views.Abstract.FormElementView conditionalBlockView = conditionalBlockViewController.view();
    org.nlamah.QL.ViewControllers.Form.ElseThenBlockViewController elseThenBlockViewController = conditionalBlockViewController.elseThenBlockViewController();
    if (elseThenBlockViewController != null) {
        elseThenBlockViewController.accept(this);
        conditionalBlockViewController.setElseThenBlockView(((org.nlamah.QL.Views.Form.ElseThenBlockView) (currentlyCreatedView)));
        conditionalBlockView.add(currentlyCreatedView);
    }
    return conditionalBlockViewController;
}