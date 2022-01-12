public void setFocus(android.content.Context context, int indexOfLastChangedWidget) {
    org.commcare.views.widgets.QuestionWidget widgetToFocus = null;
    if (indexOfLastChangedWidget != (-1)) {
        widgetToFocus = widgets.get(indexOfLastChangedWidget);
    }else
        if ((widgets.size()) > 0) {
            widgetToFocus = widgets.get(0);
        }
    
    if (widgetToFocus != null) {
        scrollToWidget(widgetToFocus);
        widgetToFocus.setFocus(context);
    }
}