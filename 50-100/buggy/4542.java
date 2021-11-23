public LeastMatrix.Output compute(prashanth.photoncodechallenge.reusable.LeastMatrix leastMatrix) throws java.lang.Exception {
    java.util.List<prashanth.photoncodechallenge.reusable.SmallestInteger> integers = shortPath.findPath(leastMatrix);
    if (integers == null) {
        throw new java.lang.Exception("Total cost exceeds 50");
    }
    return new prashanth.photoncodechallenge.reusable.LeastMatrix.Output(((integers.size()) == (leastMatrix.getWidth())), pathValue(integers), appendToRow(integers));
}