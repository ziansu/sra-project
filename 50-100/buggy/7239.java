public final void cvttpd2dq(jdk.vm.ci.code.Register dst, jdk.vm.ci.code.Register src) {
    assert (dst.getRegisterCategory().equals(AMD64.XMM)) && (src.getRegisterCategory().equals(AMD64.XMM));
    com.oracle.graal.asm.amd64.AMD64InstructionAttr attributes = new com.oracle.graal.asm.amd64.AMD64InstructionAttr(com.oracle.graal.asm.amd64.AMD64Assembler.AvxVectorLen.AVX_128bit, true, false, false, false, target);
    int encode = simdPrefixAndEncode(dst, Register.None, src, com.oracle.graal.asm.amd64.AMD64Assembler.VexSimdPrefix.VEX_SIMD_66, com.oracle.graal.asm.amd64.AMD64Assembler.VexOpcode.VEX_OPCODE_0F, attributes);
    emitByte(230);
    emitByte((192 | encode));
}