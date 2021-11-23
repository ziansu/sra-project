private void setHead(main.java.elegit.CommitHelper head) {
    if ((branchHead) != null)
        branchHead.removeAsHead(this);
    
    branchHead = head;
    if ((branchHead) != null)
        branchHead.setAsHead(this);
    
}