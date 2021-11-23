@java.lang.Override
public void write(final T value) throws me.noize.chemistry.io.ChemistryIOException {
    if (this.streams.peek().hasEntries()) {
        this.streams.peek().write(value);
    }else
        if (!(this.streams.isEmpty())) {
            me.noize.chemistry.io.EntryOutputStream<T> old = this.streams.poll();
            old.close();
            this.write(value);
        }else {
            throw new me.noize.chemistry.io.ChemistryIOException("Stream could not be advanced");
        }
    
}