public static <T> T[] shuffle(T[] objs) {
    if (objs == null) {
        return null;
    }
    java.util.List<T> ls = java.util.Arrays.asList(objs);
    ls = edu.illinois.nondex.shuffling.ControlNondeterminism.internalShuffle(ls, edu.illinois.nondex.shuffling.ControlNondeterminism.getSource());
    ls.toArray(objs);
    return objs;
}