@java.lang.Override
public void remove() {
    this.inst.queue[this.cur] = null;
    for (int i = this.cur; i < ((this.inst.size) - 1); i++) {
        this.inst.queue[i] = this.inst.queue[(i + 1)];
    }
    this.inst.queue[((this.inst.size) - 1)] = null;
    (this.inst.size)--;
}