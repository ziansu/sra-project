@com.hwangjr.rxbus.annotation.Subscribe(thread = com.hwangjr.rxbus.thread.EventThread.IO, tags = { @com.hwangjr.rxbus.annotation.Tag(value = com.wqy.daily.event.BusAction.SAVE_MEMO) })
public void saveMemo(com.wqy.daily.model.Memo memo) {
    java.lang.Long key = memo.getId();
    com.wqy.daily.event.DatasetChangedEvent event = new com.wqy.daily.event.DatasetChangedEvent();
    if (key != null) {
        event.setAction(DatasetChangedEvent.UPDATE);
    }else {
        event.setAction(DatasetChangedEvent.INSERT);
    }
    mDaoSession.getMemoDao().save(memo);
    if (com.wqy.daily.CommonUtils.isBackward(memo.getRemindTime())) {
        setReminder(memo);
    }
    com.hwangjr.rxbus.RxBus.get().post(BusAction.MEMO_DATASET_CHANGED, event);
}