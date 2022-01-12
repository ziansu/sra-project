@java.lang.Override
public void remove() {
    if ((this.pointer) == (this.head)) {
        return ;
    }
    if ((this.previous) == (this.head)) {
        this.lock.lock();
        try {
            this.previous.next = this.pointer.next;
        } finally {
            this.lock.unlock();
        }
    }else {
        this.previous.next = this.pointer.next;
    }
}