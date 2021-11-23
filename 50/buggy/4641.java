@java.lang.Override
public void exitBinaryStringNullPadded(org.jruby.truffle.format.parser.PackParser.BinaryStringNullPaddedContext ctx) {
    binaryString(((byte) (0)), false, false, ctx.count());
}