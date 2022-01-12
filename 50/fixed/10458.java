@java.lang.Override
public void run() {
    help(matcher.findCandidates(ops(), new net.imagej.ops.OpRef(name, opType, null, null)));
}