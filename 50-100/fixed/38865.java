public void subtractMonths(int months) {
    if (months < 0) {
        addMonths((-months));
    }
    year -= ((month) - months) / 12;
    month = ((month) - months) % 12;
    if ((month) == 0) {
        month = 12;
    }
}