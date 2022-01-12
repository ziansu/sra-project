@java.lang.Override
public int compare(java.lang.String o1, java.lang.String o2) {
    if (count.get(o1).equals(count.get(o2))) {
        return word.get(o1).compareTo(word.get(o2));
    }else {
        return count.get(o1).compareTo(count.get(o2));
    }
}