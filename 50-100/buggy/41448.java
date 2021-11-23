public void checkGoToTable(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction curInstruction, short nextTableId, boolean mustExist) {
    if (curInstruction instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.GoToTableCase) {
        org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.GoToTableCase goToTablecase = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.GoToTableCase) (curInstruction));
        org.junit.Assert.assertEquals(goToTablecase.getGoToTable().getTableId().shortValue(), nextTableId);
    }else {
        if (mustExist) {
            org.opendaylight.sfc.l2renderer.SfcL2FlowProgrammerTest.LOG.info("checkGoToTable expecting GoToTableCase, but received [{}]", curInstruction);
            org.junit.Assert.fail();
        }
    }
}