public void changeViewType(int inType) {
    if (inType == (_type))
        return ;
    
    if (((inType == (net.sf.memoranda.ui.CalendarPanelView.VIEW_MONTH)) | (inType == (net.sf.memoranda.ui.CalendarPanelView.VIEW_WEEK))) | (inType == (net.sf.memoranda.ui.CalendarPanelView.VIEW_DAY))) {
        _type = inType;
        this.createView();
    }else {
        _type = net.sf.memoranda.ui.CalendarPanelView.VIEW_INVALID;
    }
}