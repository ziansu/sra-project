@org.pentaho.ui.xul.stereotype.Bindable
public void addParameter() {
    java.lang.String paramName = paramNameTextBox.getValue();
    java.lang.String paramValue = paramValueTextBox.getValue();
    if ((!(org.pentaho.gwt.widgets.client.utils.string.StringUtils.isEmpty(paramName))) && (!(org.pentaho.gwt.widgets.client.utils.string.StringUtils.isEmpty(paramValue)))) {
        importDialogModel.addParameter(paramName, paramValue);
        if ((importDialogModel.getSelectedAnalysisParameter()) != null) {
            closeParametersDialog();
        }
        resetParametersDialog();
    }
}