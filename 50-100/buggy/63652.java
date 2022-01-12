public java.util.ArrayList<probcog.srl.mln.inference.InferenceResult> infer(java.lang.Iterable<java.lang.String> queries, long inferenceTimeMs) throws java.lang.Exception {
    runInference(() -> {
        probcog.srl.mln.inference.Toulbar2MAPInference.InferenceThread thread = new probcog.srl.mln.inference.Toulbar2MAPInference.InferenceThread();
        thread.start();
        thread.wait(inferenceTimeMs);
        if (!(thread.toulbar2Call.isComplete())) {
            thread.signalTermination();
            thread.join();
        }
        return thread.toulbar2Call.getSolution();
    });
    return getResults(queries);
}