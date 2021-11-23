public void afterLoggedIn(@javax.enterprise.event.Observes
@javax.enterprise.inject.Any
org.apache.webbeans.test.event.LoggedInEvent event) {
    this.userName = event.getUserName();
}