public eta.runtime.thunk.UpdateInfo push(eta.runtime.thunk.Thunk updatee, boolean marked) {
    eta.runtime.thunk.UpdateInfo ui;
    if ((free) != null) {
        ui = free;
        free = free.prev;
        ui.updatee = updatee;
    }else {
        ui = new eta.runtime.thunk.UpdateInfo(updatee, marked);
    }
    if ((bottom) == null) {
        bottom = top = ui;
        ui.prev = null;
        ui.next = null;
    }else {
        ui.prev = top;
        ui.next = null;
        top.next = ui;
        top = ui;
    }
    return ui;
}