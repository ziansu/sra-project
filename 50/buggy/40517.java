private long getAmountCreated() {
    com.hida.model.UsedSetting entity = findUsedSetting();
    return entity.getAmount();
}