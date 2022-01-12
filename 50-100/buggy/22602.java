public void printHistory(int n) {
    list.EquationList nodeTemp = head;
    int i = 0;
    while ((nodeTemp != null) && ((n == (-1)) || (i < n))) {
        if ((n == (-1)) || (i == (n - 1)))
            java.lang.System.out.println((((nodeTemp.equation) + " = ") + (nodeTemp.result)));
        
        i += 1;
        nodeTemp = nodeTemp.next;
    } 
}