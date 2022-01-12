@java.lang.Override
protected void onMethodExit(int opcode) {
    if ((isFeasible(methodAccess)) && (!(ettype.isEnter()))) {
        if (((ettype.getAttributeList().size()) != 0) && ((ettype.getAttributeList().get(0)) instanceof edu.kaist.salab.byron1st.jriext2.inst.ETTAttributeReturn)) {
            insertLoggingCodeReturnType();
        }else {
            insertLoggingCode();
        }
    }
    mv.visitEnd();
}