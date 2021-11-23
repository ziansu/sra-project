private void checkDeleteTupleToFile(se.kth.meta.entity.TupleToFile ttf) throws se.kth.meta.exception.ApplicationException {
    try {
        java.util.List<se.kth.meta.entity.RawData> rawlist = ttf.getRawData();
        if (rawlist.isEmpty()) {
            this.tupletofileFacade.deleteTTF(ttf);
        }
    } catch (se.kth.meta.exception.DatabaseException e) {
        throw new se.kth.meta.exception.ApplicationException("Server", e.getMessage());
    }
}