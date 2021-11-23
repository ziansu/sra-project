@java.lang.Override
public char readChar() throws javax.jms.JMSException {
    this.throwIfWriteOnlyModeBody();
    this.throwIfEOF();
    java.lang.Object obj = this.body.get(this.current_index);
    if (obj == null)
        throw new java.lang.NullPointerException();
    
    if (obj instanceof java.lang.Character)
        return java.lang.Character.valueOf(((java.lang.Character) (obj)));
    
    (this.current_index)++;
    throw new javax.jms.MessageFormatException("Non-supported conversion");
}