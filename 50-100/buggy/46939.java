public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
    sb.append(vid).append(" ");
    sb.append("[").append(org.jgroups.util.Util.printListWithDelimiter(members, ", ", Util.MAX_LIST_PRINT_SIZE)).append("]");
    return sb.toString();
}