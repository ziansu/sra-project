void setError(@org.jetbrains.annotations.NotNull
java.lang.Throwable error, jetbrains.mps.debugger.java.runtime.evaluation.container.IEvaluationContainer model) {
    synchronized(myStates) {
        jetbrains.mps.internal.collections.runtime.MapSequence.fromMap(myStates).put(model, new jetbrains.mps.debugger.java.runtime.ui.evaluation.EvaluationTree.FailureState(error));
    }
}