@java.lang.Override
public void writeBad() throws me.noize.chemistry.io.ChemistryIOException {
    if (!(this.streams.isEmpty())) {
        if (this.streams.peek().hasEntries()) {
            this.streams.peek().writeBad();
        }else {
            me.noize.chemistry.io.EntryOutputStream<T> old = this.streams.poll();
            old.close();
            this.writeBad();
        }
    }else {
        throw new me.noize.chemistry.io.ChemistryIOException("Stream could not be advanced");
    }
}