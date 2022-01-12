public void executeCal4() {
    if ((mrs.regIndex) == 0) {
        read0();
    }
    int oper = (CAL2_BASE) + (mrs.regIndex);
    switch (oper) {
        case TEST :
        case TEST2 :
            read0();
            and_(mrs.getValMemory(pc), __v1);
            break;
        case MUL :
            mul_();
            break;
        case DIV :
            div_();
            break;
        default :
            throw new com.zms.zpc.execute.NotImplException();
    }
}