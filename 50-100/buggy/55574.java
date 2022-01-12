public void addMonths(int months) {
    if (months < 0) {
        subtractMonths((-months));
    }
    year += ((month) + months) / 12;
    month = ((month) + months) % 12;
    if ((month) == 0) {
        month = 1;
    }
}