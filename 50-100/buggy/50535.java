@java.lang.Override
public void replace(com.fasterxml.jackson.databind.deser.SettableBeanProperty prop) {
    final java.lang.String key = prop.getName();
    switch (size) {
        case 3 :
            if (key.equals(key3)) {
                prop3 = prop;
                return ;
            }
        case 2 :
            if (key.equals(key2)) {
                prop2 = prop;
                return ;
            }
        case 1 :
            if (key.equals(key1)) {
                prop1 = prop;
                return ;
            }
    }
    throw new java.util.NoSuchElementException((("No entry '" + key) + "' found, can't replace"));
}