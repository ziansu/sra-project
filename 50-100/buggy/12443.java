@java.lang.Override
public java.lang.Object getHandle(java.lang.String name) {
    if (ds.getNames().contains(name)) {
        return new schn27.zorlog.data.DataSourceMath.Handle(false, name);
    }else
        if (mathValues.keySet().contains(name)) {
            return new schn27.zorlog.data.DataSourceMath.Handle(true, mathValues.get(name));
        }else {
            return null;
        }
    
}