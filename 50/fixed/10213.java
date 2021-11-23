@java.lang.Override
public void setFacebookLink(java.net.URL facebookLink) {
    if (facebookLink == null) {
        this.facebookLink = null;
        return ;
    }
    this.facebookLink = facebookLink.toString();
}