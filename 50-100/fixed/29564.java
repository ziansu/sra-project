@javax.annotation.PostConstruct
public void initCredentialsMatcher() {
    jodd.props.Props props = net.mayee.common.AliceHelper.getInstance().getJoddProps();
    java.lang.String algorithm = props.getValue("encrypt.hash.algorithm");
    int interations = java.lang.Integer.parseInt(props.getValue("encrypt.hash.interations"));
    net.mayee.alice.spring.shiro.AliceHashedCredentialsMatcher matcher = new net.mayee.alice.spring.shiro.AliceHashedCredentialsMatcher(algorithm);
    matcher.setHashIterations(interations);
    setCredentialsMatcher(matcher);
}