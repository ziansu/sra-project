private void regMoveHandler(java.lang.String target, lir.Environment d) {
    java.lang.String currReg = "R" + (d.getCurrentRegister());
    if (target.endsWith("]")) {
        d.addInstructionToBuilder(MoveEnum.MOVE_ARRAY, target, currReg);
    }else
        if (target.contains(".")) {
            d.addInstructionToBuilder(MoveEnum.MOVE_FIELD, target, currReg);
        }else {
            d.addInstructionToBuilder(MoveEnum.MOVE, target, currReg);
        }
    
}