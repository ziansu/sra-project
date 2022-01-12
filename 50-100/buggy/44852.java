public void setCovered(int colIndex, int n) {
    if ((this.columnsSpanned) == null)
        this.columnsSpanned = com.github.jferard.fastods.util.FullList.<java.lang.Integer>builder().blankElement(0).capacity(this.columnCapacity).build();
    
    for (int c = 0; c < n; c++)
        this.columnsSpanned.set(colIndex, (-1));
    
    this.hasSpans = true;
}