@org.chromium.base.annotations.CalledByNative
private static void callOnIsPageDistillableUpdate(org.chromium.components.dom_distiller.content.DistillablePageUtils.PageDistillableDelegate delegate, boolean isDistillable, boolean isLast) {
    if (delegate != null) {
        delegate.onIsPageDistillableResult(isDistillable, isLast);
    }
}