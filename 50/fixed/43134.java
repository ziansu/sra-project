public void closeCurrentClause() {
    this.currentClause.open = false;
    if ((currentClause.getParent()) != null)
        this.currentClause = this.currentClause.getParent();
    
}