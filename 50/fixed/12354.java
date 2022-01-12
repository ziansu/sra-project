@javax.annotation.PostConstruct
void init() {
    this.userGateway.find(currentUser.getName());
}