public static void main(java.lang.String[] args) {
    int sum = 0;
    int counter = 1;
    while (counter <= 200) {
        sum = sum + counter;
        counter++;
    } 
    java.lang.System.out.println(("Сумма чисел от 1 до 200 равна " + sum));
}