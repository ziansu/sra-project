public LeastMatrix.Output compute(prashanth.photoncodechallenge.reusable.LeastMatrix leastMatrix) {
    java.util.List<prashanth.photoncodechallenge.reusable.SmallestInteger> integers = shortPath.findPath(leastMatrix);
    if (integers == null) {
        return new prashanth.photoncodechallenge.reusable.LeastMatrix.Output(false, 0, null);
    }else {
        return new prashanth.photoncodechallenge.reusable.LeastMatrix.Output(((integers.size()) == (leastMatrix.getWidth())), pathValue(integers), appendToRow(integers));
    }
}