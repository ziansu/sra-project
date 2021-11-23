public java.lang.String Advisor() {
    java.lang.String returnMessage = SUCCESS_MESSAGE;
    uta.cse4361.businessobjects.AdvisorAccount AA = new uta.cse4361.businessobjects.AdvisorAccount();
    boolean a = AA.initialize(this.name, this.email, this.department, this.tempPassword, this.rank, this.logNum);
    if (a == false)
        return this.CREATE_ADVISOR_FAIL;
    
    uta.cse4361.databases.DatabaseManager dm = new uta.cse4361.databases.DatabaseManager();
    returnMessage = dm.register(AA);
    return returnMessage;
}