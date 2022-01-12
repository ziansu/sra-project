@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    adapter.auto.interface_example.flatten_json.TestFlattenJsonWithInterface_GsonPathModel that = ((adapter.auto.interface_example.flatten_json.TestFlattenJsonWithInterface_GsonPathModel) (o));
    if ((flattenExample) != null ? !(flattenExample.equals(that.flattenExample)) : (that.flattenExample) != null)
        return false;
    
    return true;
}