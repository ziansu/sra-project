private org.eclipse.draw2d.IFigure findFigureInComparison(at.bitandart.zoubek.mervin.model.modelreview.ModelReview review, org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.compare.Comparison comparison, org.eclipse.gef.EditPart rootEditPart) {
    org.eclipse.emf.compare.Match match = comparison.getMatch(eObject);
    if (match != null) {
        org.eclipse.draw2d.IFigure figure = findFigureInMatch(review, eObject, match, rootEditPart);
        if (figure != null) {
            return figure;
        }
    }
    return null;
}