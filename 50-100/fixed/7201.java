@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    final org.unicef.rapidreg.forms.childcase.CaseField field = getItem(position);
    org.unicef.rapidreg.widgets.helper.WidgetHelper widgetHelper = org.unicef.rapidreg.widgets.helper.WidgetHelperFactory.getWidgetHelper(getContext(), field);
    widgetHelper.setValue();
    widgetHelper.setOnClickListener();
    return widgetHelper.getConvertView();
}