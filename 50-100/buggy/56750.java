void insertFront(int ele) {
    if ((front) == 0) {
        java.lang.System.out.println("Dequeue Overflow Front");
        return ;
    }
    if (((front) == (-1)) && ((rear) == (-1))) {
        front = rear = 0;
    }else {
        front = (front) + 1;
    }
    dq[front] = ele;
}