public synchronized void markAvailableSeatTaken(int seat, java.lang.String thread) throws java.lang.InterruptedException {
    int row = (seat / 100) - 1;
    int col = (seat % 100) - 1;
    assignment6.Theater.seats[row][col] = 1;
    assignment6.Theater.seatsLeft[row] -= 1;
    if ((assignment6.Theater.seatsLeft[row]) == 0) {
        (assignment6.Theater.startRow)++;
    }
    printSeatTicket(row, col, thread);
    return ;
}