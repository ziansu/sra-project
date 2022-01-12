@java.lang.Override
public int compareTo(java.lang.Object o) {
    if (o instanceof src.PostingsList) {
        return java.lang.Integer.compare(size(), ((src.PostingsList) (o)).size());
    }
    return 0;
}