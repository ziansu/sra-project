@java.lang.Override
public E previous() {
    if ((this.previous) != null) {
        this.next = this.previous;
        this.previous = this.previous.getPrevious();
        this.lastReturned = this.next.get();
        return this.next.get();
    }
    return null;
}