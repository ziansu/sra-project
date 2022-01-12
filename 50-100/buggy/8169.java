@java.lang.Override
public java.lang.Object apply(io.warp10.script.WarpScriptStack stack) throws io.warp10.script.WarpScriptException {
    java.lang.String replacement = stack.pop().toString();
    java.lang.String regexp = stack.pop().toString();
    java.lang.String in = stack.pop().toString();
    if (this.all) {
        stack.push(in.replaceFirst(regexp, replacement));
    }else {
        stack.push(in.replaceAll(regexp, replacement));
    }
    return stack;
}