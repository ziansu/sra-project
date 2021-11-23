@java.lang.Override
public char readChar() throws javax.jms.JMSException {
    this.throwIfWriteOnlyModeBody();
    this.throwIfEOF();
    try {
        java.lang.Object obj = this.body.get(this.current_index);
        if (obj == null)
            throw new java.lang.NullPointerException();
        
        if (obj instanceof java.lang.Character)
            return java.lang.Character.valueOf(((java.lang.Character) (obj)));
        
        throw new javax.jms.MessageFormatException("Non-supported conversion");
    } finally {
        (this.current_index)++;
    }
}