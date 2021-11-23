public int calculateA() {
    int count = 0;
    count += (getName().length()) - (getName().replaceAll(" ", "").length());
    count = (count + 1) + (getAge());
    do {
        count = count - 7;
    } while (count >= 10 );
    return count;
}