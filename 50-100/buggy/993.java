public int cumulativeProduct() {
    int product = 1;
    list.EquationList e = head;
    int s = size;
    while (s > 0) {
        product = product * (e.result);
        s -= 1;
        e = e.next;
    } 
    return product;
}