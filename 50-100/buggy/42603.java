@java.lang.Override
public boolean equals(java.lang.Object otherClient) {
    if (!(otherClient instanceof Client)) {
        return false;
    }else {
        Client newClient = ((Client) (otherClient));
        return (this.getClientName().equals(newClient.getClientName())) && ((this.getClientId()) == (newClient.getClientId()));
    }
}