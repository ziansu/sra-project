public void finish() {
    if ((data) != null)
        org.basex.query.up.primitives.DropDB.drop(data, qc.context.soptions);
    
}