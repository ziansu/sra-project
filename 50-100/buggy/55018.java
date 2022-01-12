@java.lang.Override
public void remove() {
    if ((this.pointer) != (this.head)) {
        if ((this.previous) == (this.head)) {
            this.lock.lock();
            try {
                this.previous.next = this.pointer.next;
                this.pointer = this.pointer.next;
            } finally {
                this.lock.unlock();
            }
        }else {
            this.previous.next = this.pointer.next;
        }
    }
}