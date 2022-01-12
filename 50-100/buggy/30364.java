public void addToFront(java.lang.String name, java.lang.String tel, java.lang.String email, java.lang.String address, java.lang.String dob) {
    if ((head) == null)
        head = new AddressList.ListNode(name, tel, email, address, dob);
    else {
        AddressList.ListNode temp = head;
        head = new AddressList.ListNode(name, tel, email, address, dob);
        head.setNext(temp);
        rewind();
    }
    isEmpty = false;
}