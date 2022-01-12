private comp207p.main.InstructionList do_i2d(comp207p.main.InstructionHandle handle, comp207p.main.InstructionList il) {
    java.lang.Integer in = stack.pop().intValue();
    java.lang.Double d = in.doubleValue();
    stack.push(d);
    il = removeHandle(il, handle);
    return il;
}