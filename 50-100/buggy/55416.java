@java.lang.Override
public void update(java.util.Observable theObservable, java.lang.Object theObject) {
    if (theObject instanceof java.util.ArrayList) {
        if ((((java.util.ArrayList) (theObject)).size()) > 0) {
            if ((((java.util.ArrayList) (theObject)).get(0)) instanceof java.lang.String) {
                myContentPanelHolder.remove(myContentPanel);
                buildContentPanel();
                updatePanel(theObject);
            }
        }
    }
}