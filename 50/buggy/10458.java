@java.lang.Override
public void run() {
    help(matcher.findCandidates(ops(), net.imagej.ops.OpRef.create(name, opType)));
}