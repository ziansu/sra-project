public static void evaluate(edu.illinois.cs.cogcomp.core.experiments.evaluators.Evaluator evaluator, edu.illinois.cs.cogcomp.core.experiments.ClassificationTester eval, edu.illinois.cs.cogcomp.core.datastructures.textannotation.TextAnnotation gold, edu.illinois.cs.cogcomp.core.datastructures.textannotation.TextAnnotation predicted, java.lang.String viewName) throws java.lang.Exception {
    edu.illinois.cs.cogcomp.core.datastructures.textannotation.View goldView = gold.getView(viewName);
    edu.illinois.cs.cogcomp.core.datastructures.textannotation.View predictedView = predicted.getView(viewName);
    evaluator.setViews(goldView, predictedView);
    evaluator.evaluate(eval);
}