private static boolean completedRoyalString(jp.hichain.prototype.algorithm.ChainNode root) {
    int royalPoints = jp.hichain.prototype.algorithm.Converter.getPoints(root, null);
    int royalMin = jp.hichain.prototype.algorithm.Converter.getChainLengthMin(Chain.ROYAL);
    return royalPoints >= (royalMin * royalMin);
}