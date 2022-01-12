public static void save(hardcorequesting.QuestingData questingData, hardcorequesting.DataWriter dw, boolean light) {
    if (light) {
        dw.writeData(hardcorequesting.QuestingData.getData().size(), DataBitHelper.PLAYERS);
        for (hardcorequesting.QuestingData q : hardcorequesting.QuestingData.getData().values()) {
            dw.writeString(q.getName(), DataBitHelper.NAME_LENGTH);
            q.getDeathStat().save(dw);
        }
    }else {
        questingData.getDeathStat().save(dw);
    }
}