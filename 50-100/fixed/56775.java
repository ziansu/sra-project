private static int[] getQueryCoordinates(maf.MAF_Hit h) {
    int queryStart = ((h.getFrameDir()) == (hits.Hit.FrameDirection.POSITIVE)) ? h.getQueryStart() : ((h.getQueryStart()) - (h.getQueryLength())) + 1;
    int queryEnd = (queryStart + (h.getQueryLength())) - 1;
    int[] coord = new int[]{ queryStart , queryEnd };
    return coord;
}