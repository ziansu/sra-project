public void read() {
    readField("flags");
    readField("op_count");
    op = new capstone.M680x.Operand[op_count];
    if ((op_count) != 0)
        readField("op");
    
}