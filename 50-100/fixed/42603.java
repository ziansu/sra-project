@java.lang.Override
public boolean equals(java.lang.Object otherClient) {
    if (!(otherClient instanceof Client)) {
        return false;
    }else {
        Client newClient = ((Client) (otherClient));
        return (this.getName().equals(newClient.getName())) && ((this.getId()) == (newClient.getId()));
    }
}