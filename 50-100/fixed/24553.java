public edu.unc.genomics.Interval next(int length) {
    long randomStart = generator.nextLong(randomRange);
    edu.unc.genomics.Interval bed = fastaIndex.getContigAndLocation(randomStart);
    if ((((bed.getStop()) - 1) + length) > (fastaIndex.getContigSize(bed.getChr()))) {
        bed = this.next(length);
    }else {
        bed.setStop((((bed.getStop()) - 1) + length));
    }
    return bed;
}