@java.lang.Override
public E next() {
    this.previous = this.pointer;
    this.pointer = this.pointer.next;
    return this.previous.element;
}