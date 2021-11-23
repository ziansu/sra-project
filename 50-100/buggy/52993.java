private void checkMiddleTagLine(java.lang.String content) {
    if (isTopRecord) {
        return ;
    }
    if (!(parentERecord.hasMiddleTag())) {
        return ;
    }
    if (parentERecord.isMiddleTagLine(content)) {
        final java.util.List<cn.ytxu.http_wrapper.template.expression.ExpressionRecord> middleTagRecords = records;
        records.clear();
        callback.middleTagLine(content, middleTagRecords);
    }
}