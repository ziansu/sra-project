@java.lang.Override
public cs444.codegen.tiles.InstructionsAndTiming<cs444.codegen.arm.instructions.bases.ArmInstruction> generate(final cs444.parser.symbols.ast.expressions.ArrayAccessExprSymbol arrayAccess, final cs444.codegen.Platform<cs444.codegen.arm.instructions.bases.ArmInstruction, cs444.codegen.arm.Size> platform) {
    final cs444.codegen.tiles.InstructionsAndTiming<cs444.codegen.arm.instructions.bases.ArmInstruction> instructions = super.generate(arrayAccess, platform);
    final cs444.codegen.SizeHelper<cs444.codegen.arm.instructions.bases.ArmInstruction, cs444.codegen.arm.Size> sizeHelper = platform.getSizeHelper();
    instructions.add(new cs444.codegen.arm.instructions.Add(cs444.codegen.arm.Register.R0, cs444.codegen.arm.Register.R8, cs444.codegen.arm.Register.R8, sizeHelper));
    instructions.add(new cs444.codegen.arm.instructions.Pop(cs444.codegen.arm.Register.R8));
    return instructions;
}