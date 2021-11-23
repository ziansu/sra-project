@java.lang.Override
public void write(int address, int value) {
    (mNumOpcodeCycles)++;
    java.lang.System.out.println(((("Writing " + value) + " at ") + (java.lang.Integer.toHexString(address))));
    memory.write(address, value);
}