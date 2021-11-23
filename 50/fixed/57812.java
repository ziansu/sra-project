public void buidPassingList() {
    this.passingList.removeAll(this.passingList);
    if ((this.listRequest.size()) > 0)
        this.passingList.add(this.listRequest.get(0));
    
}