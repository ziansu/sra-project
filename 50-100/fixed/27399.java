@java.lang.Override
protected com.github.zhongl.ipage.Cursor<com.github.zhongl.kvengine.Entry<T>> execute() throws java.lang.Throwable {
    com.github.zhongl.ipage.Cursor<com.github.zhongl.kvengine.Entry<T>> next = iPage.next(entryCursor);
    if (next.isEnd())
        return next;
    
    java.lang.Long offset = index.get(next.lastValue().key());
    if ((offset != null) && (offset.equals(entryCursor.offset())))
        return next;
    
    return com.github.zhongl.ipage.Cursor.cursor(next.offset(), null);
}