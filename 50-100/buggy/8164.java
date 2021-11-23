public void dump(java.io.DataOutputStream out) throws java.io.IOException {
    super.dump(out);
    out.writeInt(high);
    out.writeInt(low);
    for (int i = 0; i < (switchAddresses.length); i++) {
        out.writeShort(switchAddresses[i]);
        out.writeShort(switchBranchTargetIndexes[i]);
    }
}