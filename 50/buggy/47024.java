public void insert(Domain domain) {
    if ((head) == null)
        head = new DomainNode(domain);
    else {
        FeatureNode temp = new FeatureNode(domain);
        temp.setNext(head);
        head = temp;
    }
}