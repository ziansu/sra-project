private void copyDate2SalesTotalShowList(java.util.List<com.tjhx.entity.info.SalesMonthTotal_Show> _salesTotalShowList, java.util.List<com.tjhx.entity.info.SalesMonthTotalItem> _salesYearTotal, int orgCnt) {
    for (com.tjhx.entity.info.SalesMonthTotalItem _salesMonthTotalItem : _salesYearTotal) {
        for (com.tjhx.entity.info.SalesMonthTotal_Show _salesMonthTotalShow : _salesTotalShowList) {
            int equalsRes = _salesMonthTotalShow.myEquals(_salesMonthTotalItem);
            if (0 != equalsRes) {
                _salesMonthTotalShow.copyData(_salesMonthTotalItem, equalsRes, orgCnt);
            }
        }
    }
}