public static boolean containsAll(java.util.List<com.subcherry.repository.core.RevisionRange> ranges, com.subcherry.repository.core.RevisionRange value) {
    for (long rev = value.getStart().getNumber(), end = value.getEnd().getNumber(); rev <= end; rev++) {
        if (!(com.subcherry.repository.core.RevisionRanges.contains(ranges, rev))) {
            return false;
        }
    }
    return true;
}