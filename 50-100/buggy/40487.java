private void setEmptyState(java.lang.Boolean areActions) {
    if ((getView()) == null)
        return ;
    
    getView().findViewById(R.id.actions_section).setVisibility((areActions ? android.view.View.VISIBLE : android.view.View.GONE));
    ((android.widget.TextView) (getView().findViewById(R.id.add_integration_btn))).setText((areActions ? R.string.change_integration : R.string.add_integration));
    getView().findViewById(R.id.update_config).setVisibility((areActions ? android.view.View.VISIBLE : android.view.View.GONE));
}