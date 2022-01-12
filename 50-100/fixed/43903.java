public void addExon(int start, int end) {
    if (((this.start) == (-1)) || ((this.start) > start)) {
        this.start = start;
    }
    if (((this.end) == (-1)) || ((this.end) < end)) {
        this.end = end;
    }
    exons.add(new io.compgen.ngsutils.annotation.GTFAnnotationSource.GTFExon(this, start, end));
    java.util.Collections.sort(exons);
}