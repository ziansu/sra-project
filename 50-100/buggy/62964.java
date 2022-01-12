public long getAgentIdByLogin(java.lang.String name) throws i5.las2peer.p2p.AgentNotKnownException {
    try {
        i5.las2peer.persistency.Envelope env = i5.las2peer.security.Context.getCurrent().fetchEnvelope(((i5.las2peer.security.UserAgentManager.PREFIX_USER_NAME) + (name.toLowerCase())));
        return ((java.lang.Long) (env.getContent()));
    } catch (i5.las2peer.api.exceptions.StorageException e) {
        throw new i5.las2peer.p2p.AgentNotKnownException("Username not found!", e);
    } catch (i5.las2peer.tools.SerializationException | i5.las2peer.tools.CryptoException e) {
        throw new i5.las2peer.p2p.AgentNotKnownException("Could not read agent id from storage");
    }
}