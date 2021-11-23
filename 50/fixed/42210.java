@java.lang.Override
public java.lang.String getText() {
    if ((!(scheme.isAll())) && (!(datas.isEmpty())))
        return datas.get(0);
    
    return null;
}