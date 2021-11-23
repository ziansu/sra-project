public void setDataBox(com.dreamfly.timeschedule.model.TimeStruct timeStruct) {
    mTSBox.setB_finish(timeStruct.getB_finish());
    mTSBox.setS_title(timeStruct.getS_titile());
    mTSBox.setI_status(timeStruct.getI_status());
    mTSBox.setS_start_time(timeStruct.getS_start_time());
    com.dreamfly.timeschedule.utils.greendao.TSRepository.insertOrUpdate(mContext, mTSBox);
}