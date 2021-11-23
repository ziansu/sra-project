public int calculateA() {
    int count = 0;
    count += (getName().length()) - (getName().replaceAll(" ", "").length());
    count = (count + 1) + (getAge());
    do {
        count = count - 7;
        java.lang.System.out.println(count);
    } while (count >= 10 );
    return 0;
}