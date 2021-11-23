public void token_discard(int client_token) {
    int index = client_token - 1;
    this.token_ring[index] = false;
}