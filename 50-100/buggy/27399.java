@java.lang.Override
protected com.github.zhongl.ipage.Cursor<com.github.zhongl.kvengine.Entry<T>> execute() throws java.lang.Throwable {
    com.github.zhongl.ipage.Cursor<com.github.zhongl.kvengine.Entry<T>> next = iPage.next(entryCursor);
    if (next.isEnd())
        return next;
    
    if (index.contains(next.lastValue().key()))
        return next;
    
    return com.github.zhongl.ipage.Cursor.cursor(next.offset(), null);
}