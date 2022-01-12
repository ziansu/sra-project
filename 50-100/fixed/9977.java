@java.lang.Override
public void write(final me.noize.chemistry.io.Entry<T> entry) throws me.noize.chemistry.io.ChemistryIOException {
    if (!(this.streams.isEmpty())) {
        if (this.streams.peek().hasEntries()) {
            this.streams.peek().write(entry);
        }else {
            me.noize.chemistry.io.EntryOutputStream<T> old = this.streams.poll();
            old.close();
            this.write(entry);
        }
    }else {
        throw new me.noize.chemistry.io.ChemistryIOException("Stream could not be advanced");
    }
}