public static java.lang.String makeName(java.lang.String originalName, int increment) {
    if (increment == 0) {
        return originalName + "_1stOrderDiff";
    }else {
        return ((originalName + "_1stOrderDiff(") + increment) + ")";
    }
}