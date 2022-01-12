public void addCDS(int start, int end) {
    if (((cdsStart) == (-1)) || ((cdsStart) > start)) {
        cdsStart = start;
    }
    if (((cdsEnd) == (-1)) || ((cdsEnd) < end)) {
        cdsEnd = end;
    }
    cds.add(new io.compgen.ngsutils.annotation.GTFAnnotationSource.GTFExon(this, start, end));
}