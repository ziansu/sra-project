public boolean start4Top() {
    while (contentListIterator.hasNext()) {
        java.lang.String content = contentListIterator.next();
        cn.ytxu.http_wrapper.template.expression.ExpressionEnum expression = cn.ytxu.http_wrapper.template.expression.ExpressionEnum.getByStartLineContent(content);
        cn.ytxu.http_wrapper.template.expression.ExpressionRecord record = expression.createRecord(content, isTopRecord);
        records.add(record);
        record.convertContents2SubRecordsIfCan(contentListIterator);
    } 
    callback.endTagLine(records);
    return true;
}