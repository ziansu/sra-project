public java.lang.String toString() {
    LNode point = head;
    java.lang.String ans = "[";
    while ((point.getNext()) != null) {
        ans += point;
        point = point.getNext();
        ans += ",";
    } 
    ans += point + "]";
    return ans;
}