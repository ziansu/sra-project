public static boolean contains(com.subcherry.repository.core.RevisionRange range, long rev) {
    return ((range.getStart().getNumber()) < rev) && (rev <= (range.getEnd().getNumber()));
}