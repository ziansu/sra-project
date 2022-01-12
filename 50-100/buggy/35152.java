@java.lang.Override
public void onSuccess(ro.pub.cs.vmchecker.client.model.ResultInfo[] result) {
    container.clear();
    processResults(result);
    listenTableEvents();
    widget.displayInfo(user, assignments, teamResultsInfo, studentResultsInfo);
    container.add(((ro.pub.cs.vmchecker.client.presenter.Widget) (widget)));
    eventBus.fireEvent(new ro.pub.cs.vmchecker.client.event.StatusChangedEvent(StatusChangedEvent.StatusType.RESET, null));
}