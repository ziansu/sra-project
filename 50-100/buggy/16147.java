@java.lang.Override
public int execute() {
    final boolean bitSet = checkBit(register.get());
    flagsRegister.set(FlagsRegister.Flag.P, flagsRegister.get(FlagsRegister.Flag.Z));
    flagsRegister.set(FlagsRegister.Flag.S, (((((bitPosition) == 7) || ((bitPosition) == 5)) || ((bitPosition) == 3)) && bitSet));
    return 8;
}