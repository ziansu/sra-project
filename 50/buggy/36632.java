private boolean hasReadyPush() {
    if ((getStatusEnum()) == (com.lguipeng.notes.model.SNote.Status.NEED_PUSH)) {
        return true;
    }
    return false;
}