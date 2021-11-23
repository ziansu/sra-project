@java.lang.Override
public boolean uses(cs444.codegen.instructions.InstructionArg<cs444.codegen.arm.instructions.bases.ArmInstruction, ?> what) {
    return ((((dest.uses(what)) || (lhs.uses(what))) || (rhs.uses(what))) || (lhs.uses(what))) || (add.uses(what));
}