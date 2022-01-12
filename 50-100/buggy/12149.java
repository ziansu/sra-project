void getChain(java.io.DataInputStream din, java.io.DataOutputStream dout) throws java.lang.Exception {
    java.lang.String username = peergos.shared.corenode.CoreNodeUtils.deserializeString(din);
    java.util.List<peergos.shared.corenode.UserPublicKeyLink> chain = coreNode.getChain(username).get();
    dout.writeInt(chain.size());
    for (peergos.shared.corenode.UserPublicKeyLink link : chain) {
        peergos.shared.util.Serialize.serialize(link.owner.serialize(), dout);
        peergos.shared.util.Serialize.serialize(link.serialize(), dout);
    }
}