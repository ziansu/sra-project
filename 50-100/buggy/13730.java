private static void transposeMethod(int input) {
    node x = TransposeMethod.head;
    while ((x.next.data) != input) {
        x = x.next;
    } 
    if (x == (TransposeMethod.head.next)) {
        return ;
    }else {
        int tempValue = x.data;
        x.data = x.next.data;
        x.next.data = tempValue;
    }
}