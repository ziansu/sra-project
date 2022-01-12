public java.util.Iterator<com.github.erihoss.img2a.ImageRow> iterator() {
    return new java.util.Iterator<com.github.erihoss.img2a.ImageRow>() {
        int rowIndex;

        public boolean hasNext() {
            return (rowIndex) < rowCount;
        }

        public com.github.erihoss.img2a.ImageRow next() {
            return new com.github.erihoss.img2a.ImageRow(reader_self, ((this.rowIndex)++));
        }

        public void remove() {
        }
    };
}