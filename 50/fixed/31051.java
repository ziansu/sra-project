public com.noname.server.json.CredentialOut doLoginByToken(com.noname.server.entity.Credential credential) throws com.noname.server.exception.InvalidCredentialsException {
    final com.noname.server.entity.Credential credentialDB = credentialRepository.findByIdAndToken(credential);
    if (credentialDB == null)
        throw new com.noname.server.exception.InvalidCredentialsException();
    
    return credentialAdapter.adapt(credentialDB);
}