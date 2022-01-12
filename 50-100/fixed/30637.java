public eta.runtime.thunk.Thunk pop() {
    eta.runtime.thunk.Thunk res = null;
    eta.runtime.thunk.UpdateInfo ui = top;
    top = top.prev;
    res = ui.updatee;
    if ((top) == null) {
        bottom = null;
    }else {
        top.next = null;
    }
    ui.prev = free;
    ui.next = null;
    ui.updatee = null;
    ui.marked = false;
    free = ui;
    return res;
}