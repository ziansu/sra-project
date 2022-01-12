private boolean hasReadyPush() {
    return (getStatusEnum()) == (com.lguipeng.notes.model.SNote.Status.NEED_PUSH);
}