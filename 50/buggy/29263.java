@java.lang.Override
public jauhararifin.common.buffer.Buffer put(jauhararifin.common.buffer.Buffer item) {
    for (int i = 0; i < (item.size()); i++)
        return this.put(item.getByte(i));
    
    return this;
}