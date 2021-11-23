@java.lang.Override
public java.util.Iterator<Item> iterator() {
    java.lang.System.out.printf("Nowwww array length %d size %d first %d last %d!%n", this.array.length, size, first, last);
    return new QueueIterator<Item>(array, first, size);
}