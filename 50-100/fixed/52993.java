private void checkMiddleTagLine(java.lang.String content) {
    if (!(parentERecord.hasMiddleTag())) {
        return ;
    }
    if (parentERecord.isMiddleTagLine(content)) {
        callback.middleTagLine(content, records);
        records.clear();
    }
}