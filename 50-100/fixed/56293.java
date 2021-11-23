@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public boolean equals(java.lang.Object obj) {
    return ((obj instanceof common.Pair) && (elem1.equals(((common.Pair<T>) (obj)).elem1))) && (elem2.equals(((common.Pair<T>) (obj)).elem2));
}