public static void main(java.lang.String[] args) throws java.io.IOException {
    GUI.accounts = new java.util.ArrayList<Account>();
    GUI.trans = new java.util.ArrayList<Transaction>();
    IO.initAccount(GUI.accounts);
    IO.initTrans(GUI.trans);
    if (!(GUI.accounts.isEmpty())) {
        GUI.currAccount = GUI.accounts.get(0);
    }
    if (!(GUI.trans.isEmpty())) {
        GUI.currTrans = GUI.trans.get(0);
    }
    GUI.GUI();
}