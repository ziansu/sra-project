@java.lang.Override
public int compareTo(java.lang.Object o) {
    if (o instanceof src.PostingsList) {
        return java.lang.Integer.compare(((src.PostingsList) (o)).size(), size());
    }
    return 0;
}