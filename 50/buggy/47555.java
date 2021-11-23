private static htsjdk.samtools.CigarElement binaryCigarToCigarElement(final int cigarette) {
    final int binaryOp = cigarette & 15;
    final int length = cigarette >> 4;
    return new htsjdk.samtools.CigarElement(length, htsjdk.samtools.CigarOperator.binaryToEnum(binaryOp));
}