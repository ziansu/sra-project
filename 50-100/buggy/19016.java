public void setPlacedBlock(com.peterverzijl.softwaresystems.qwirkle.Node node) {
    for (com.peterverzijl.softwaresystems.qwirkle.Node n : mFrontier) {
        if (n.getPosition().equals(node.getPosition())) {
            n.setBlock(node.getBlock());
            mSetBlocks.add(n);
            mFrontier.remove(n);
            break;
        }
    }
    java.lang.System.out.println(("Amount of stones placed on board: " + (mSetBlocks.size())));
}