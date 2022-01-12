@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup collection, int position) {
    android.view.View view;
    switch (position) {
        case 0 :
            view = new com.rockthevote.grommet.ui.eventFlow.EventDetailsEditable(context);
            break;
        case 1 :
            view = new com.rockthevote.grommet.ui.eventFlow.SessionTimeTracking(context);
            break;
        case 2 :
            view = new com.rockthevote.grommet.ui.eventFlow.SessionSummary(context);
            break;
        default :
            view = new com.rockthevote.grommet.ui.eventFlow.EventDetailsEditable(context);
            break;
    }
    collection.addView(view);
    pages.put(position, ((com.rockthevote.grommet.ui.eventFlow.EventFlowPage) (view)));
    return view;
}