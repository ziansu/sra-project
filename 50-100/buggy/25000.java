@java.lang.Override
public void onRenderStateChanged(com.jaspersoft.android.sdk.widget.report.renderer.RenderState renderState) {
    resourceWebView.setVisibility((renderState == (com.jaspersoft.android.sdk.widget.report.renderer.RenderState.RENDERED) ? android.view.View.VISIBLE : android.view.View.GONE));
    if ((renderState == (com.jaspersoft.android.sdk.widget.report.renderer.RenderState.INITED)) && (inPending)) {
        reportRenderer.render(runOptions);
    }
    reportEventListener.onActionsAvailabilityChanged(isControlActionsAvailable());
}