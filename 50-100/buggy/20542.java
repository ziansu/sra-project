private void checkForKeyByName(org.apache.cloudstack.api.command.user.ssh.RegisterSSHKeyPairCmd cmd, com.cloud.user.Account owner) throws com.cloud.exception.InvalidParameterValueException {
    com.cloud.user.SSHKeyPairVO existingPair = _sshKeyPairDao.findByName(owner.getAccountId(), owner.getDomainId(), cmd.getName());
    if (existingPair != null) {
        throw new com.cloud.exception.InvalidParameterValueException((("A key pair with name '" + (cmd.getName())) + "' already exists for this account."));
    }
}