public void dump(java.io.DataOutputStream out) throws java.io.IOException {
    super.dump(out);
    out.writeInt(low);
    out.writeInt(((high) - (low)));
    for (int i = 0; i < (switchAddresses.length); i++) {
        out.writeShort(switchAddresses[i]);
        out.writeShort(switchBranchTargetIndexes[i]);
    }
}