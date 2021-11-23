public com.intelliment.entity.AclEntry getExpectedEntry() {
    com.intelliment.entity.AclEntryBuilder builder = new com.intelliment.entity.AclEntryBuilder(new com.intelliment.control.SubnetUtilsAnalyzer());
    builder.source("43.0.0.0/8");
    builder.destination("0.0.0.0/32");
    builder.protocol(com.intelliment.entity.Protocol.valueOf("udp/53839,49944,58129,21778"));
    builder.action(AclEntry.ActionType.DENY);
    return builder.build();
}