@java.lang.Override
public java.lang.String getString(T t) {
    if ((mMapper) == null) {
        throw new java.lang.InstantiationError("没有设置显示内容");
    }
    return mMapper.getString(t);
}