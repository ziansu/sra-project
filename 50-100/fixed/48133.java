protected int checkChannel(li.cil.oc.api.machine.Arguments args, int index) {
    int channel = (args.checkInteger(index)) - 1;
    if ((channel >= 0) && (channel < (process.states.size()))) {
        return channel;
    }
    throw new java.lang.IllegalArgumentException(("invalid channel: " + (channel + 1)));
}