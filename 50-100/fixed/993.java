public int cumulativeProduct() {
    int product = 1;
    list.EquationList e = head;
    int k = size;
    while (k > 0) {
        product = product * (e.result);
        k -= 1;
        e = e.next;
    } 
    return product;
}