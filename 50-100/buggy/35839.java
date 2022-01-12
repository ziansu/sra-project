private void store(W window, VA va) throws java.lang.Exception {
    com.google.cloud.dataflow.sdk.values.CodedTupleTag<VA> tag = accumulatorTag(window);
    context.keyedState().store(tag, va);
    activeWindowManager.addWindow(window);
    liveWindowsModified = liveWindows.add(window);
}