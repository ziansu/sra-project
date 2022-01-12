private void fireEvent(org.rstudio.studio.client.workbench.views.source.editors.text.ace.AceEditorCommandEvent.CommandType type, org.rstudio.studio.client.workbench.views.source.editors.text.ace.AceEditorCommandEvent.ExecutionPolicy policy) {
    org.rstudio.studio.client.workbench.views.source.editors.text.ace.AceEditorCommandEvent event = new org.rstudio.studio.client.workbench.views.source.editors.text.ace.AceEditorCommandEvent(type, policy);
    if (org.rstudio.studio.client.common.satellite.Satellite.isCurrentWindowSatellite())
        events_.fireEventToSatellite(event, org.rstudio.core.client.dom.WindowEx.get());
    else
        events_.fireEvent(event);
    
}