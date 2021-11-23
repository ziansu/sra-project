@java.lang.Override
public java.lang.String commandStructure() {
    java.lang.String nbt = (getId()) + ":[";
    for (int i = 0; i < (value.size()); i++) {
        if (i != 0)
            nbt += ",";
        
        nbt += value.get(i).commandStructure();
    }
    return nbt + "]";
}