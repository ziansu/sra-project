@java.lang.Override
public int compare(Node n1, Node n2) {
    java.lang.String num1 = n1.getCortage();
    java.lang.String num2 = n2.getCortage();
    if ((num1.compareTo(num2)) > 0) {
        return 1;
    }else
        if ((num1.compareTo(num2)) < 0) {
            return -1;
        }else {
            return 0;
        }
    
}