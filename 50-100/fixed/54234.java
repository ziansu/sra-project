@java.lang.Override
public void putAll(final org.apache.logging.log4j.spi.ContextData source) {
    assertNotFrozen();
    assertNoConcurrentModification();
    if ((source instanceof org.apache.logging.log4j.util.ArrayContextData) && ((this.size) == 0)) {
        initFrom0(((org.apache.logging.log4j.util.ArrayContextData) (source)));
    }else
        if (source != null) {
            if (source == (this)) {
                return ;
            }
            source.forEach(org.apache.logging.log4j.util.ArrayContextData.PUT_ALL, this);
        }
    
}