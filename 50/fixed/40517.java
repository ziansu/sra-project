private long getAmountCreated() {
    com.hida.model.UsedSetting entity = findUsedSetting();
    if (entity == null) {
        return 0;
    }else {
        return entity.getAmount();
    }
}