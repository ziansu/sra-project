private org.uengine.essencia.modeling.canvas.IElement findPracticeRootElement(java.util.List<org.uengine.essencia.modeling.canvas.IElement> practiceElementList) {
    org.uengine.essencia.modeling.canvas.IElement practiceRootElementView = null;
    for (org.uengine.essencia.modeling.canvas.IElement element : practiceElementList) {
        if (element instanceof org.uengine.essencia.model.Practice) {
            practiceRootElementView = element;
            break;
        }
    }
    return practiceRootElementView;
}